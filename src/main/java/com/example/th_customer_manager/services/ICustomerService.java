package com.example.th_customer_manager.services;

import com.example.th_customer_manager.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    List<Customer> findById(int id);

}
