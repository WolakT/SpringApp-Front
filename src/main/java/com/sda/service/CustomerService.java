package com.sda.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sda.model.Customer;

@Service
public class CustomerService {

    private RestTemplate restTemplate;

    public CustomerService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Customer> getAll() {
        ResponseEntity<List> forEntity = restTemplate.getForEntity("http://localhost:8080/customer/findall", List.class);
        return forEntity.getBody();
    }
}
