package com.demo.petstore.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("dog")
public class Dog extends Pet{

    @Override
    public String speak() {
        return "멍멍";
    }

    @Override
	public void eat(){
		energy = energy + 2;
	}
    
}
