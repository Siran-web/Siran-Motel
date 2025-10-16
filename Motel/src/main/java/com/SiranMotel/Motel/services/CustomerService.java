package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.CustomerDTO;
import com.SiranMotel.Motel.entities.CustomerEntity;
import com.SiranMotel.Motel.exception.ResourceNotFoundException;
import com.SiranMotel.Motel.modelMappers.CustomerModelMapper;
import com.SiranMotel.Motel.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        CustomerEntity entity = CustomerModelMapper.toEntity(customerDTO);
        CustomerEntity savedEntity = customerRepository.save(entity);
        return CustomerModelMapper.toDTO(savedEntity);
    }

    public List<CustomerDTO> getAllCustomers() {
        List<CustomerEntity> customerEntities = customerRepository.findAll();
        List<CustomerDTO> customerDTOs = new ArrayList<>();
        for (CustomerEntity customerEntity : customerEntities) {
            customerDTOs.add(CustomerModelMapper.toDTO(customerEntity));
        }
        return customerDTOs;
    }

    public void isExistByCustomerId(Long customerId) {
        boolean exists = customerRepository.existsById(customerId);
        if (!exists) throw new ResourceNotFoundException("Customer not found with Id:" + customerId);
    }

    public CustomerDTO getCustomerById(Long customerId) {
        isExistByCustomerId(customerId);
        CustomerEntity customer = customerRepository.findById(customerId).orElse(null);
        assert customer != null;
        return CustomerModelMapper.toDTO(customer);
    }

    public Boolean deleteCustomer(Long customerId) {
        isExistByCustomerId(customerId);
        customerRepository.deleteById(customerId);
        return true;
    }

    public CustomerDTO updateCustomer(Long customerId, CustomerDTO customerDTO) {
        isExistByCustomerId(customerId);
        CustomerEntity entity = CustomerModelMapper.toEntity(customerDTO);
        entity.setCustomerId(customerId);
        CustomerEntity savedEntity = customerRepository.save(entity);
        return CustomerModelMapper.toDTO(savedEntity);
    }


}
