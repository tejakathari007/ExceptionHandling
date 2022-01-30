package com.tejakathari.exceptionhandling.controlleradvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestControllerAdviceCustom {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleCityNotFoundException(Exception ex, WebRequest request) {
		
		System.out.println(request);
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", "testing controller advice");

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
