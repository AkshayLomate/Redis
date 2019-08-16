package com.connectingdots.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

public class StudentsRepositoryImpl implements StudentsRepositoryCustom {

	@Autowired
	private StudentsRepository studentsRepository;
	
	@Cacheable(value="student12",keyGenerator = "customKeyGenerator")
	public Students addStudents() {
		
		Students students = Students.builder().id("12345").name("akash").address("pune").marks(78).build();

		Students students1 = studentsRepository.save(students);
		
		return students1;
	}
}
