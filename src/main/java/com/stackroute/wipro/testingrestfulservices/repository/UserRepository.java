package com.stackroute.wipro.testingrestfulservices.repository;

import com.stackroute.wipro.testingrestfulservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
