package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String street;
    private String city;
    private String zipCode;

    public Address() {
        System.out.println("Address object is created");
    }

    public Address(String addressLine1, String addressLine2, String street, String city, String zipCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    @Value("Bhawan Nagar")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    @Value("Marehara")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getStreet() {
        return street;
    }

    @Value("Mohanpur")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    @Value("Etha")
    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Value("207401")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
