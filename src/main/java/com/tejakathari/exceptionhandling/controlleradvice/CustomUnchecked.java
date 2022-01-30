package com.tejakathari.exceptionhandling.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomUnchecked extends RuntimeException {

	public CustomUnchecked(String message) {
		super(message);
	}

}
