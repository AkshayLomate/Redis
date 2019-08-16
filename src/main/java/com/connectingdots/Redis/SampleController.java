package com.connectingdots.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/sample")
public class SampleController {

	@Autowired
	private StudentsRepository studentsRepository;
	
	

	//@CacheEvict(value= "studentInformation", allEntries= true)
	//@Cacheable(value = "result", key="#name")
	//@CacheEvict(value= "studentInformation", allEntries= true)
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Students sampleController() {//(@RequestParam(value = "name" ,required = true) String name) {

		Students result = studentsRepository.addStudents();
		System.out.println("djsagdjs");
		//return new ResponseEntity<Students>(result,HttpStatus.OK);
		
		return result;
	}
	
	/**
	 * reference link : https://www.concretepage.com/spring-boot/spring-boot-redis-cache
	 *
	 **/

}
