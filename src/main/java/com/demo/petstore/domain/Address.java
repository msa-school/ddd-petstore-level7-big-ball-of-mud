package com.demo.petstore.domain;

import javax.persistence.Embeddable;

// Value Object
@Embeddable
public class Address {

    String detail;
    String zipcode;

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}
