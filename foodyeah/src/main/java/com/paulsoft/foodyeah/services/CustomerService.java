package com.paulsoft.foodyeah.services;

import com.paulsoft.foodyeah.exceptions.ResourceException;
import com.paulsoft.foodyeah.dtos.CreateCustomerDto;
import com.paulsoft.foodyeah.dtos.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto getCustomerByCode(String code) throws ResourceException;

    CustomerDto getCustomerById(Long id) throws ResourceException;

    List<CustomerDto> getCustomersByState(Boolean state) throws ResourceException;

    List<CustomerDto> getCustomers() throws ResourceException;

    CustomerDto createCustomer(CreateCustomerDto createCustomerDto) throws ResourceException;

    CustomerDto updateCustomer(CreateCustomerDto updateCustomerDto, Long id) throws ResourceException;

    String deleteCustomer(Long id) throws ResourceException;


}