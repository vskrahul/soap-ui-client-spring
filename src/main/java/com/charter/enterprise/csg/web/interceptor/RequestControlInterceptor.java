package com.charter.enterprise.csg.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.charter.enterprise.csg.exception.ForbiddenException;

public class RequestControlInterceptor implements HandlerInterceptor {
	
	private Logger logger = LoggerFactory.getLogger(RequestControlInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = true;
		RequestCounts instance = RequestCounts.getInstance();
		try {
			if(instance.rejectRequest()) {
				flag = false;
			}
		} catch(ForbiddenException e) {
			logger.error(e.getMessage());
			response.sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
		}
		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
