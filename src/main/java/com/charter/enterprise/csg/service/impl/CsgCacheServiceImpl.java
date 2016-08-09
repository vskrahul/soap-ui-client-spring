package com.charter.enterprise.csg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.csg.model.cache.CsgCache;
import com.charter.enterprise.csg.repository.CsgCacheRepository;
import com.charter.enterprise.csg.service.CsgCacheService;

@Service
public class CsgCacheServiceImpl implements CsgCacheService {

	@Autowired
	private CsgCacheRepository repository;
	
	@Override
	public String clearCache(String cacheName) {
		return repository.clearCache(cacheName);
	}

	@Override
	public String clearAllCache() {
		return repository.clearAllCache();
	}

	@Override
	public List<CsgCache> listCache() {
		return repository.listCache();
	}

	
}
