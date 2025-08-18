package com.example.demo1.service.impl;

import com.example.demo1.entity.Employee;

import com.example.demo1.repositories.EmployeeRepository;
import com.example.demo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Optional<Employee> existing = employeeRepository.findById(id);
        if (existing.isPresent()) {
            Employee employee = existing.get();
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            employee.setDepartment(updatedEmployee.getDepartment());
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> existing = employeeRepository.findByIdAndIsDeletedFalse(id);
        if (existing.isPresent()) {
            Employee employee = existing.get();
            employee.setDeleted(true);
            employeeRepository.save(employee);
        }
    }

}
