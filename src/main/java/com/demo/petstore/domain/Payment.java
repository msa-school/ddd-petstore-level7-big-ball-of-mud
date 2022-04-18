package com.demo.petstore.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Payment {

    String method;
    String status;

    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
