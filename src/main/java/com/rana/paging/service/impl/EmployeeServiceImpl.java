package com.rana.paging.service.impl;

import com.rana.paging.model.Employee;
import com.rana.paging.repository.EmployeeRepository;
import com.rana.paging.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {



    @Autowired
    EmployeeRepository employeeRepository;

 /*   @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }*/
    @Override
    public Page<Employee> list(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
}
