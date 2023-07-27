package com.sai.service;

import java.util.List;

import com.sai.dto.StudentDto;

public interface IStudentService {
	public StudentDto findStudentById(String id);
	public StudentDto saveStudent(StudentDto dto);
	public List<StudentDto> findAllByNameInAndAgeBetween(String[] names, Integer ageAbove, Integer ageBelow);
	public void deleteStudentById(String id);
}
