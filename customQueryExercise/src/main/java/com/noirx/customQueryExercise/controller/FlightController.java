package com.noirx.customQueryExercise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noirx.customQueryExercise.entity.Flight;
import com.noirx.customQueryExercise.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {

	private FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@PostMapping("/{id}")
	public List<Flight>createFlight(@PathVariable("id") Integer numFlights){
		return flightService.createFlights(numFlights);
	}
	
	@GetMapping("/getAll")
	public List<Flight> getAll(){
		return flightService.getAll();
	}
}
