package com.tejakathari.exceptionhandling.controlleradvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerCustom {

	@GetMapping("/getException")
	public String getException() throws Exception {
		throw new Exception("testing controller advice");

	}
	
	@GetMapping("/getCustomException")
	public String getCustomException() throws Exception {
		throw new CustomUnchecked("testing controller advice");

	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> exception(Exception exception) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", "testing @ExceptionHandler");

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
