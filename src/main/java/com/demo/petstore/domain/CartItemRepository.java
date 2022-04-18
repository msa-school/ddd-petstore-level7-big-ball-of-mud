package com.demo.petstore.domain;

import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, Long>{    // Repository Pattern Interface
  
}