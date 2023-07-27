package com.sai.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class StudentDto {
	private String sid;
	@NonNull
	private String name;
	@NonNull
	private Integer age;
	@NonNull
	private String city;
}
