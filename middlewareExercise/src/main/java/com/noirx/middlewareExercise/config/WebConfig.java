package com.noirx.middlewareExercise.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.noirx.middlewareExercise.interceptor.ApiLoggingInterceptor;
import com.noirx.middlewareExercise.interceptor.LegacyInterceptor;
import com.noirx.middlewareExercise.interceptor.MonthInterceptor;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{

	private ApiLoggingInterceptor apiLoggingInterceptor;
	private LegacyInterceptor legacyInterceptor;
	private MonthInterceptor monthInterceptor;
	
	public WebConfig(ApiLoggingInterceptor apiLoggingInterceptor, LegacyInterceptor legacyInterceptor, MonthInterceptor monthInterceptor) {
		this.apiLoggingInterceptor = apiLoggingInterceptor;
		this.legacyInterceptor =  legacyInterceptor;
		this.monthInterceptor =  monthInterceptor;
	}
	@Override
	public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
		registry.addInterceptor(apiLoggingInterceptor);
		registry.addInterceptor(legacyInterceptor);
		registry.addInterceptor(monthInterceptor);
	}
}
