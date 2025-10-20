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

    @DeleteMapping(path = "/{customerId}")
    public ResponseEntity<Boolean> deleteCustomer(@PathVariable Long customerId) {
        Boolean gotDeleted = customerService.deleteCustomer(customerId);
        if(gotDeleted)
            return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/id/{customerId}")
    public ResponseEntity<CustomerDTO>  updateCustomer(@PathVariable Long customerId, @RequestBody CustomerDTO customerDTO) {
        CustomerDTO updatedCustomer = customerService.updateCustomer(customerId, customerDTO);
        return ResponseEntity.ok(updatedCustomer);
    }

    @GetMapping(path = "/name/{name}")
    public ResponseEntity<CustomerDTO> getCustomerByName(@PathVariable String name) {
        CustomerDTO customerDTO = customerService.getCustomerByName(name);
        return ResponseEntity.ok(customerDTO);
    }

}
