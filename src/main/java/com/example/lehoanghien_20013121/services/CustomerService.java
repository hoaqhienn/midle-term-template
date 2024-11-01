package com.example.lehoanghien_20013121.services;

import com.example.lehoanghien_20013121.model.Customer;
import com.example.lehoanghien_20013121.repositories.CustomerRepository;

import java.util.List;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
