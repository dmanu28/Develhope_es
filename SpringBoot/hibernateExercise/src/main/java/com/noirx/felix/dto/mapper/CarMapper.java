package com.noirx.felix.dto.mapper;

import org.springframework.stereotype.Component;

import com.noirx.felix.dto.CarDTO;
import com.noirx.felix.entity.Car;

@Component
public class CarMapper {

	public CarDTO mapToDTO(Car car) {
		return  CarDTO.builder()
				.modelName(car.getModelName())
				.type(car.getType())
				.build();
	}
	
	public Car mapToEntity(CarDTO carDto) {
		return Car.builder()
				.modelName(carDto.getModelName())
				.type(carDto.getType())
				.build();
	}
}
