package com.demo.petstore.domain;

//import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
//import javax.persistence.OneToMany;


@Entity
public class CartItem {

    @Id  @GeneratedValue
    Long id;
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

    @ManyToOne
    Customer customer;
        public Customer getCustomer() {
            return customer;
        }
        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

    @OneToMany
    List<Pet> items;
        public List<Pet> getItems() {
            return items;
        }
        public void setItems(List<Pet> items) {
            this.items = items;
        }

    @Embedded
    Payment payment;
        public Payment getPayment() {
            return payment;
        }
        public void setPayment(Payment payment) {
            this.payment = payment;
        }

    
}
