package com.noirx.felix.service;

import java.util.List;

import com.noirx.felix.dto.CarDTO;

public interface CarService {

	public CarDTO createCar(CarDTO carDto);
	public List<CarDTO> getAll();
	public CarDTO getById(Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
}
