package com.charter.enterprise.csg.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.csg.model.cache.CsgCache;
import com.charter.enterprise.csg.service.CsgCacheService;

@RestController
@RequestMapping(value = "cache")
public class ClearCacheController {

	
	@Autowired
	private CsgCacheService service;
	
	@RequestMapping(value = "/{cacheName}", method = {RequestMethod.DELETE})
	public String clearCache(@PathVariable("cacheName") String cacheName) {
		return service.clearCache(cacheName);
	}
	
	@RequestMapping(value = "all", method = {RequestMethod.DELETE})
	public String clearAllCache() {
		return service.clearAllCache();
	}
	
	@RequestMapping(value = "list", method = {RequestMethod.GET})
	public List<CsgCache> listCache() {
		return service.listCache();
	}
}
