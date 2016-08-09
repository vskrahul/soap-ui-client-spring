package com.charter.enterprise.csg.config;

public enum Environment {

	DEV("dev"), TEST("test"), QA("qa"), UAT("uat"), PROD("prod");

	private String environment;

	private Environment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return this.environment;
	}
}
