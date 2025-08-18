package com.example.demo1.service;

import com.example.demo1.entity.Employee;
import java.util.List;

public interface EmployeeService {
     List<Employee> getAllEmployees();
     Employee getEmployeeById(Long id);
     Employee createEmployee(Employee employee);
     Employee updateEmployee(Long id, Employee updatedEmployee);
     void deleteEmployee(Long id);
}
