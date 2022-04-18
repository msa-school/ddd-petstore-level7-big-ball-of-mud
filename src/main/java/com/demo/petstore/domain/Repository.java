package com.demo.petstore.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Pet, Integer>{
    
}
