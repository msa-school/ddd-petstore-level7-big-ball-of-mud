package com.demo.petstore.domain;

import org.springframework.data.jpa.repository.JpaRepository;


// http :8080/cats
public interface CatRepository extends JpaRepository<Cat, Integer>{
    
}
