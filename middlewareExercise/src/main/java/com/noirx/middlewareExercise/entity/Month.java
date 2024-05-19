package com.noirx.middlewareExercise.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Month {

	private Integer monthNumber;
	private String englishName;
	private String italianName;
	private String germanName;
}
