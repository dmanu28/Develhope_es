package com.noirx.customQueryExercise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.noirx.customQueryExercise.entity.Flight;
import com.noirx.customQueryExercise.repository.FlightRepo;

@Service
public class FlightService {

	private FlightRepo flightRepo;

	public FlightService(FlightRepo flightRepo) {
		this.flightRepo = flightRepo;
	}
	
	public List<Flight> createFlights(Integer numFlights){
		List<Flight>result = new ArrayList<>();
		if(numFlights == 0) {
			return null;
		}
		for(int i = 0; i < numFlights; i++) {
			result.add(new Flight(i +1));
		}
		flightRepo.saveAll(result);
		return result;
	}
	
	public List<Flight>getAll(){
		return flightRepo.findAll();
	}
}
