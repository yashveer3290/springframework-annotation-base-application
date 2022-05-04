package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("customer")
@Lazy(true)
public class Customer {
    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private String mobile;

    @Autowired
    private Address address;

    public Customer() {
        System.out.println("Customer object is created");
    }

    public Customer(String firstname, String lastName, String email, String mobile, Address address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    @Value("1001")
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    @Value("Amit")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    @Value("Kumar")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    @Value("a01122@gmail.com")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    @Value("8989898989")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }
}
