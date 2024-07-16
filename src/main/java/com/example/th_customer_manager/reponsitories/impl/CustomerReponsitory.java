package com.example.th_customer_manager.reponsitories.impl;

import com.example.th_customer_manager.models.Customer;
import com.example.th_customer_manager.reponsitories.ICustomerReponsitory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerReponsitory implements ICustomerReponsitory {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Tinh", "tinh@gmail.com", "Ha noi"));
        customers.add(new Customer(2, "Truong", "Truong@gmail.com", "Quang nam"));
        customers.add(new Customer(3, "Ngoc", "Ngoc@gmail.com", "Hcm"));
        customers.add(new Customer(4, "Long", "Long@gmail.com", "Hue"));
    }


    @Override
    public List<Customer> finfAll() {
        return customers;
    }

    @Override
    public  List<Customer> findById(int id) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customerList.add(customer);
            }
        }
        return customerList;
    }
}
