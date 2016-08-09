package com.charter.enterprise.csg.web.interceptor;

import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.charter.enterprise.csg.exception.ForbiddenException;


public class RequestCounts {

	private Logger logger = LoggerFactory.getLogger(RequestCounts.class);
	
	private Date requestFlagTime;
	
	private Integer perHourReuquestLimit;
	
	private Integer requestCounter;
	
	public static final Integer PER_HOUR_REQUEST_LIMIT_DEFAULT = 100;
	
	private static RequestCounts _instance;
	
	private RequestCounts() {
		this.requestCounter = 0;
		this.requestFlagTime = new Date();
		this.perHourReuquestLimit = 0;
	}
	
	public static RequestCounts getInstance() {
		if(_instance == null) {
			synchronized(RequestCounts.class) {
				if(_instance == null) {
					_instance = new RequestCounts();
					_instance.logger.info("Creating singleton instance of RequestCounts class." + _instance);
				}
			}
		}
		return _instance;
	}
	
	/**
	 * Returns true if the number of requests is greater than the number of request configured to server in one hour.
	 * 
	 * @return boolean
	 */
	public boolean rejectRequest() throws ForbiddenException{
		boolean flag = true;
		
		Calendar c = Calendar.getInstance();
		c.setTime(this.requestFlagTime);
		c.add(Calendar.HOUR, 1);
		
		Date requestTime = new Date();
		Date thresholdTime = c.getTime();
		int compare = requestTime.compareTo(thresholdTime);
		/**
		 * request time is less than threshold time.
		 * Has to check request limit for this request.
		 */
		if(compare < 0) {
			if(this.requestCounter < this.perHourReuquestLimit) {
				flag = false;
			} else {
				logger.info("OOP's you reached the allowed requests limits in one hour i.e.;" + this.perHourReuquestLimit + ", please try after " + thresholdTime);
				throw new ForbiddenException("OOP's you reached the allowed requests limits in one hour i.e.;" + this.perHourReuquestLimit + ", please try after " + thresholdTime);
			}
		} else {
			/**
			 * Reset request flag time & request counter.
			 */
			this.requestFlagTime = new Date();
			this.requestCounter = 1;
			flag = false;
			logger.info("Resets all request counters.");
		}
		return flag;
	}

	public void setPerHourReuquestLimit(Integer perHourReuquestLimit) {
		this.perHourReuquestLimit = perHourReuquestLimit;
		if(this.perHourReuquestLimit <= 0) {
			this.perHourReuquestLimit = RequestCounts.PER_HOUR_REQUEST_LIMIT_DEFAULT;
		}
	}

	public Integer getRequestCounter() {
		return requestCounter;
	}

	public void setRequestCounter(Integer requestCounter) {
		this.requestCounter = requestCounter;
	}
}