package com.sda.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sda.model.Customer;
import com.sda.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public String customers(Map<String, Object> model) {
        List<Customer> customers = customerService.getAll();
        model.put("customers", customers);
        return "customers";
    }
}
