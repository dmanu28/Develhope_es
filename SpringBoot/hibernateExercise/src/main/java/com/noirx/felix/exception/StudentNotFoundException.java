package com.noirx.felix.exception;

import java.util.function.Supplier;

public class StudentNotFoundException extends RuntimeException implements Supplier<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6536972885631933808L;

	private Integer id;
	
	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(Integer id) {
		this.id = id;
	}
	
	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}


	public StudentNotFoundException(String message) {
		super(message);
	}


	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}


	@Override
	public String get() {
		return "Stundent "+id+" was not found. Please try another ID";
	}

}
