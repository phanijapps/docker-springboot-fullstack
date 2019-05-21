package com.perficient.spring.fullstack.springemployeefullstack.controller;


import com.perficient.spring.fullstack.springemployeefullstack.dao.Customers;
import com.perficient.spring.fullstack.springemployeefullstack.errorhandling.EntityNotFoundException;
import com.perficient.spring.fullstack.springemployeefullstack.repository.CustomersRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cm/api/v1")
public class CustomersService {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping(path = "/customers")
    public Page<Customers> getEmployeeEntity(
        @RequestParam(defaultValue = "50") int pageSize, 
        @RequestParam(defaultValue = "0") int pageNum) throws EntityNotFoundException{

        Pageable defaultSize = PageRequest.of(pageNum, pageSize);
        return customersRepository.findAll(defaultSize);

    }





}