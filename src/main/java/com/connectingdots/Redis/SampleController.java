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
	 StudentsRepository studentInfoRepository;

	@CacheEvict(value= "allArticlesCache", allEntries= true)
	//@Cacheable(value = "studentInformation", key = "#name")
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Students sampleController(@RequestParam(value = "name") String name) {

		Students students = Students.builder().id("12345").name(name).address("pune").marks(76).build();

		Students result = studentInfoRepository.save(students);
		return result;
	}
	/**
	 * reference link:https://www.concretepage.com/spring-boot/spring-boot-redis-cache
	 */

}
