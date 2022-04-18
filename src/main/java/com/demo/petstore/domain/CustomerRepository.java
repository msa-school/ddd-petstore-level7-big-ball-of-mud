package com.demo.petstore.domain;


import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String>{    // Repository Pattern Interface
  
}