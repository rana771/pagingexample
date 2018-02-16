package com.rana.paging.controller;

import com.rana.paging.model.Employee;
import com.rana.paging.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @RequestMapping(value="/list",method= RequestMethod.GET)
    public Page<Employee> list(Pageable pageable){
        Page<Employee> employees = employeeService.list(pageable);
        return employees;
    }
}
