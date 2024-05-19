package com.noirx.middlewareExercise.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ApiLoggingInterceptor implements HandlerInterceptor{

	private static final Logger LOG =  LoggerFactory.getLogger(ApiLoggingInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getRequestURI().contains("/time")) {
			LOG.info("HEADER: {}",request.getHeader("User-agent"));
			return true;
		}
		return false;
	}
}
