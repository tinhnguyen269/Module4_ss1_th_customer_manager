package com.example.th_customer_manager.services.impl;

import com.example.th_customer_manager.models.Customer;
import com.example.th_customer_manager.reponsitories.ICustomerReponsitory;
import com.example.th_customer_manager.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerReponsitory customerReponsitory;

    @Override
    public List<Customer> findAll() {
        return customerReponsitory.finfAll();
    }

    @Override
    public  List<Customer> findById(int id) {
        return customerReponsitory.findById(id);
    }

}
