package com.fis.springjpa;

import org.springframework.data.repository.CrudRepository;

import com.fis.springjpa.employee.Employee;

//import com.example.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

	void save(Employee n);

}
