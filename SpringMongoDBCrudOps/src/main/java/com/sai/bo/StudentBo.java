package com.sai.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBo {

	@Id
	private String sid;

	@NonNull
	private String name;

	@NonNull
	private Integer age;

	@NonNull
	private String city;
}
