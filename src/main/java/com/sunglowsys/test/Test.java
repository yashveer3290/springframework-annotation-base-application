package com.sunglowsys.test;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = context.getBean("customer",Customer.class);
        System.out.println("Customer Id:"+customer.getId());
        System.out.println("Customer FirstName:"+customer.getFirstname());
        System.out.println("Customer LastName:"+customer.getLastName());
        System.out.println("Customer Email:"+customer.getEmail());
        System.out.println("Customer Mobile:"+customer.getMobile());
        System.out.println(customer.getAddress());
        Address address = context.getBean("address",Address.class);
        System.out.println("Address Id:"+address.getId());
        System.out.println("Address AddressLine1:"+address.getAddressLine1());
        System.out.println("Address AddressLine2:"+address.getAddressLine2());
        System.out.println("Address Street:"+address.getAddressLine1());
        System.out.println("Address City:"+ address.getCity());
        System.out.println("Address ZipCode:"+address.getZipCode());


    }
}
