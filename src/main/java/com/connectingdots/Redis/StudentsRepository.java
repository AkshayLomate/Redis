package com.connectingdots.Redis;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentsRepository extends MongoRepository<Students, Serializable> {

}
