package com.charter.enterprise.csg.config;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CacheConfig {

	private EhCacheCacheManager ehCacheManager;
	
	public CacheConfig() {
		this.ehCacheManager = new EhCacheCacheManager(ehCacheCacheManager().getObject());
	}
	
	public EhCacheCacheManager cacheManager() {
		return this.ehCacheManager;
	}

	public EhCacheManagerFactoryBean ehCacheCacheManager() {
		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
		Resource resource = new ClassPathResource("ehcache.xml");
		cmfb.setConfigLocation(resource);
		cmfb.setShared(true);
		return cmfb;
	}
	
}
