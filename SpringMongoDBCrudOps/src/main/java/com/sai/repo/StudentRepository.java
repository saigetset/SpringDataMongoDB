package com.sai.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sai.bo.StudentBo;

public interface StudentRepository extends MongoRepository<StudentBo, String> {
	public List<StudentBo> findAllByNameInAndAgeBetween(String[] names, Integer ageAbove, Integer ageBelow);
}
