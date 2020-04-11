package com.online.taxi.feign.exception;

import com.netflix.hystrix.exception.HystrixBadRequestException;

public class BusinessException extends HystrixBadRequestException {
	
	private String message;
	
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
