package com.charter.enterprise.csg.repository.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.csg.config.Caches;
import com.charter.enterprise.csg.model.cache.CsgCache;
import com.charter.enterprise.csg.repository.CsgCacheRepository;

import net.sf.ehcache.CacheManager;

@Repository
public class CsgCacheRepositoryWs implements CsgCacheRepository {

	@Autowired
	@Qualifier("cacheManager")
	private EhCacheCacheManager cacheManager;
	
	@Override
	public String clearCache(String cacheName) {
		String result = "SUCCESS";
		try {
			_clearCache(cacheName);
		} catch(IllegalArgumentException e) {
			result = e.getMessage();
		}
		return result;
	}

	@Override
	public String clearAllCache() {
		Collection<String> caches = cacheManager.getCacheNames();
		Iterator<String> itr = caches.iterator();
		while(itr.hasNext()) {
			String cacheName = itr.next();
			_clearCache(cacheName);
		}
		return "SUCCESS";
	}

	@Override
	public List<CsgCache> listCache() {
		List<CsgCache> list = new ArrayList<CsgCache>();
		
		CacheManager ehCacheManager = cacheManager.getCacheManager();
		
		Collection<String> caches = cacheManager.getCacheNames();
		Iterator<String> itr = caches.iterator();
		
		while(itr.hasNext()) {
			String cacheName = itr.next();
			net.sf.ehcache.Cache ehCache = ehCacheManager.getCache(cacheName);
			CsgCache cache = new CsgCache();
			cache.setCacheName(cacheName);
			cache.setDescription(Caches.getDescription(cacheName));
			cache.setSize(ehCache.getSize());
			list.add(cache);
		}
		return list;
	}
	
	private void _clearCache(String cacheName) throws IllegalArgumentException {
		Cache cache = cacheManager.getCache(cacheName);
		try{
			cache.clear();
		} catch(NullPointerException e) {
			throw new IllegalArgumentException("Could not found cache : " + cacheName);
		}
	}
	
}
