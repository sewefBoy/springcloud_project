package com.online.taxi.feign.exception;

public class HystrixIgnoreException extends RuntimeException {
	
	private String message;
	
	public HystrixIgnoreException(String message) {
		this.message = message;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
