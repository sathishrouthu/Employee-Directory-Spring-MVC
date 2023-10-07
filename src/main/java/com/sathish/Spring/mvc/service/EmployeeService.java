package com.sathish.Spring.mvc.service;

import com.sathish.Spring.mvc.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee theEmployee);

    public void deleteById(int id);

}
