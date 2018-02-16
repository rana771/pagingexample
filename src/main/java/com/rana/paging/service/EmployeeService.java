package com.rana.paging.service;

import com.rana.paging.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> list(Pageable pageable);
}
