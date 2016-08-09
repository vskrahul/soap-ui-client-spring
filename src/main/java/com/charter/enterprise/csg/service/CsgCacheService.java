package com.charter.enterprise.csg.service;

import java.util.List;

import com.charter.enterprise.csg.model.cache.CsgCache;

/**
 * Contains the all CSG Cache operations.
 * 
 * @author Rahul
 *
 */
public interface CsgCacheService {
	
	/**
	 * To clear specific cache.
	 * 
	 * @param cacheName
	 * @return
	 */
	public String clearCache(String cacheName);
	
	/**
	 * To clean the all cache from server.
	 * 
	 * @return
	 */
	public String clearAllCache();
	
	/**
	 * List down all cache names.
	 * 
	 * @return
	 */
	public List<CsgCache> listCache();
}
