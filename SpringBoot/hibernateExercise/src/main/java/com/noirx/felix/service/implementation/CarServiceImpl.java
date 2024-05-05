package com.noirx.felix.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noirx.felix.dto.CarDTO;
import com.noirx.felix.dto.mapper.CarMapper;
import com.noirx.felix.entity.Car;
import com.noirx.felix.repository.CarRepo;
import com.noirx.felix.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	private CarRepo carRepo;
	private CarMapper carMapper;
	
	public CarServiceImpl(CarRepo carRepo, CarMapper carMapper) {
		this.carRepo = carRepo;
		this.carMapper = carMapper;
	}
	@Override
	public CarDTO createCar(CarDTO carDto) {
		Car car = carRepo.save(carMapper.mapToEntity(carDto));
		return carMapper.mapToDTO(car);
	}

	@Override
	public List<CarDTO> getAll() {
		List<Car> inventory = carRepo.findAll();
		List<CarDTO> result = new ArrayList<>();
		for(Car car : inventory) {
		result.add(carMapper.mapToDTO(car));
		}
		return result;
	}

	@Override
	public CarDTO getById(Integer id) {
		Optional<Car> car = carRepo.findById(id);
		if(car.isEmpty()) {
			return null;
		}
		return carMapper.mapToDTO(car.get());
	}
	
	public CarDTO updateCarType(CarDTO carDto, Integer id) {
		Optional<Car> car = carRepo.findById(id);
		if(car.isEmpty()) {
			return null;
		}
		Car updatable = car.get();
		updatable.setType(carDto.getType());
		return carMapper.mapToDTO(carRepo.save(updatable));
	}

	@Override
	public void deleteById(Integer id) {
		carRepo.deleteById(id);
	}

	public boolean exists(Integer id) {
		return carRepo.existsById(id);
	}
	@Override
	public void deleteAll() {
		carRepo.deleteAll();
	}
}
