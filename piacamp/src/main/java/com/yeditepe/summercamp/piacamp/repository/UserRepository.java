package com.yeditepe.summercamp.piacamp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yeditepe.summercamp.piacamp.model.User;

public interface UserRepository extends MongoRepository<User, UUID>{

	User findByUserName(String username);	
	List<User> findByName(String name);
	
}
