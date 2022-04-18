package com.demo.petstore.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

//Aggregate Root
@Entity
public class Customer {
    @Id
    String id;

    @Embedded
    Address address;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    

}
