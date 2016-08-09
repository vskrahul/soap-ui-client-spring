package com.charter.enterprise.csg.model.cache;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CsgCache implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1926468022984348423L;

	private String cacheName;
	
	private String description;
	
	private int size;

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
