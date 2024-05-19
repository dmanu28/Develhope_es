package com.noirx.middlewareExercise.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicController {

	@GetMapping("/time")
	public String getTime() {
		LocalDateTime now = LocalDateTime.now();
		return now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome to our App.";
	}
	
}
