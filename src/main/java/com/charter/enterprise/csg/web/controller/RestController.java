package com.charter.enterprise.csg.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/rest")
public class RestController {
	
	@RequestMapping(value = "/check/{id}", method = RequestMethod.GET, produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> getResponse(@PathVariable("id") String pathParam, @RequestParam("name") String name){
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("id =  " + pathParam + ", and name : " + name, HttpStatus.OK);
		return responseEntity;
	}
}
