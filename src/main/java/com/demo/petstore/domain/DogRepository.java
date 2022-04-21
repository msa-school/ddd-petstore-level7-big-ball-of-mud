package com.demo.petstore.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/// http :8080/dogs 
public interface DogRepository extends JpaRepository<Dog, Integer>{
    
}
