package com.bridgelabz.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ApplicationController {

	@GetMapping("/status")
	@ApiOperation(value = "API for checking the status.", 
	notes = "API for checking the status of service working properly or not. If the message is displayed in response"
			+ "with 200 status then the api is working properly.")
	public ResponseEntity<String> getApiStatus() {
		return ResponseEntity.ok("Backend Working properly");
	}
}
