package com.noirx.middlewareExercise.interceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.noirx.middlewareExercise.entity.Month;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MonthInterceptor implements HandlerInterceptor {

	private Logger LOG = LoggerFactory.getLogger(MonthInterceptor.class);
	public static final List<Month>months = new ArrayList<>(Arrays.asList(
		new Month(1, "January", "Gennaio", "Januar"),
		new Month(2, "February", "Febbraio", "Feb"),
		new Month(3, "March", "Marzo", "Mar"),
		new Month(4, "April", "Aprile", "April"),
		new Month(5, "May", "Maggio", "May"),
		new Month(6, "June", "Giugno", "Jun")));
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String monthHeader = request.getHeader("monthNumber");
		if(monthHeader.isEmpty()) {
			throw new Exception("No monthNumber Header");
		}
		Integer monthNum = Integer.parseInt(monthHeader);
		Month month = new Month();
		for(int j = 0; j < months.size(); j++) {
			if(months.get(j).getMonthNumber() == monthNum) {
				month.setMonthNumber(months.get(j).getMonthNumber());
				month.setEnglishName(months.get(j).getEnglishName());
				month.setGermanName(months.get(j).getGermanName());
				month.setItalianName(months.get(j).getItalianName());
			}
			LOG.info("Month: {}",month);
		}
		request.setAttribute("month", month);
		return true;
		
	}
}
