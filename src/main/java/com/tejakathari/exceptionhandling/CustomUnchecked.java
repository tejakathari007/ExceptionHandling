package com.tejakathari.exceptionhandling;

@SuppressWarnings("serial")
public class CustomUnchecked extends RuntimeException {

	public CustomUnchecked(String message) {
		super(message);
	}

}
