package com.noirx.felix.dto;

import com.noirx.felix.entity.Car.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDTO {

	private String modelName;
	private Type type;
	
}
