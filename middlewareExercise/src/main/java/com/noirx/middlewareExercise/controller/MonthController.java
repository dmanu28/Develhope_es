package com.noirx.middlewareExercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MonthController {

	@GetMapping("/month")
	public Object getMonth(HttpServletRequest request) {
		return request.getAttribute("month");
	}
}
