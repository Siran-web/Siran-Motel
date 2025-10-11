package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.CustomerDTO;
import com.SiranMotel.Motel.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO createdCustomer = customerService.createCustomer(customerDTO);
        return ResponseEntity.ok(createdCustomer);
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customerDTOs = customerService.getAllCustomers();
        return ResponseEntity.ok(customerDTOs);
    }

    @GetMapping(path = "/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long customerId) {
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customerDTO);
    }


}
