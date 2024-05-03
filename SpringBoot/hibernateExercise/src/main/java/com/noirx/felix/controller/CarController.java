package com.noirx.felix.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noirx.felix.dto.CarDTO;
import com.noirx.felix.service.implementation.CarServiceImpl;

@RestController
@RequestMapping("/cars")
public class CarController {

	private CarServiceImpl carService;
	
	public CarController(CarServiceImpl carService) {
		this.carService = carService;
	}
	
	@PostMapping("/create")
	public CarDTO createCar(@RequestBody CarDTO car) {
		return carService.createCar(car);
	}
	
	@GetMapping("/getAll")
	public List<CarDTO> getAllCars(){
		return carService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public CarDTO getCarById(@PathVariable("id") Integer id) {
		return carService.getById(id);
	}
	
	@PutMapping("/update/{id}")
	public CarDTO updateCar(@PathVariable("id") Integer id, @RequestBody CarDTO carDto) {
		return carService.updateCarType(carDto, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<CarDTO> deleteCarById(@PathVariable("id") Integer id) {
		if(carService.exists(id)) {
			carService.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<CarDTO>deleteAll(){
		carService.deleteAll();
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
