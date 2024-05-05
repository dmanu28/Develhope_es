package com.noirx.felix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseStudentDTO {

	private String firstName;
	private String lastName;
	private String email;
	private Boolean isWorking;
}
