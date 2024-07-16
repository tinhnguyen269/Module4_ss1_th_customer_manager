package com.example.th_customer_manager.controllers;

import com.example.th_customer_manager.models.Customer;
import com.example.th_customer_manager.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String displayAllCustomer(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }
    @GetMapping("/infor")
    public String displayInfor(@RequestParam("id") int id, Model model){
        List<Customer> customers = customerService.findById(id);
        model.addAttribute("customers", customers);
        return "infor";
    }


}



