/**
 * 
 */
package com.charter.enterprise.csg.model.json;

/**
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
public class JsonResponse<T> {

	private T body;
	
	private JsonResponseStatus status;
	
	private String error;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public JsonResponseStatus getStatus() {
		return status;
	}

	public void setStatus(JsonResponseStatus status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}