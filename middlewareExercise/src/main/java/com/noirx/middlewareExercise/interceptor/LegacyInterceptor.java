package com.noirx.middlewareExercise.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LegacyInterceptor implements HandlerInterceptor{

	private static final Logger Log = LoggerFactory.getLogger(LegacyInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getRequestURI().contains("/legacy")) {
			response.sendError(410);
			Log.info("no longer here");
			return false;
		}
		return true;
	}
}
