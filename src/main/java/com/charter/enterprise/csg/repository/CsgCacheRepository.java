package com.charter.enterprise.csg.repository;

import java.util.List;

import com.charter.enterprise.csg.model.cache.CsgCache;

public interface CsgCacheRepository {

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
