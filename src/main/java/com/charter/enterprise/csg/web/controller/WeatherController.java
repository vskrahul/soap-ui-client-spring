package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;

import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

@RestController
public class WeatherController {

	private Logger logger = LoggerFactory.getLogger(WeatherController.class);
	
	@Autowired
	@Qualifier("weatherProxy")
	private JaxWsPortProxyFactoryBean weatherProxy;
	
	XwsSecurityInterceptor a;
	
	@RequestMapping(value = "weather", method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public WeatherReturn getCityWeatherByZIPResult(@RequestParam("Zip") String zipCode) {
		logger.info("Finding out City Weather of ZIP : " + zipCode);
		WeatherSoap service = (WeatherSoap)weatherProxy.getObject();
		WeatherReturn weatherReturn = service.getCityWeatherByZIP(zipCode);
		logger.info("Result for City : " + weatherReturn.getCity() + " " + weatherReturn);
		return weatherReturn;
	}
}
