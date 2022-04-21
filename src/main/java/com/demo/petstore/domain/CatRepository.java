package com.demo.petstore.domain;

import org.springframework.data.jpa.repository.JpaRepository;


// http :8080/cats   <--- CRUD 에 대한 REST API 자동생성 
public interface CatRepository extends JpaRepository<Cat, Integer>{
    
}
