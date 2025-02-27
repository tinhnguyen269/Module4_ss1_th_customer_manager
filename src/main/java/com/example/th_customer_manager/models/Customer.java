package com.example.th_customer_manager.models;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;

    public Customer(int id, String name, String email,String address) {
        this.address = address;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
