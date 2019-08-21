package com.MongoAssesment.assesment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MongoAssesment.assesment.model.users;

@Repository
public interface userRepo extends MongoRepository<users, String> {

}
