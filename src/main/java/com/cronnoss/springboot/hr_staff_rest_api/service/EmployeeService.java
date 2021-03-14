package com.cronnoss.springboot.hr_staff_rest_api.service;



import com.cronnoss.springboot.hr_staff_rest_api.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    public Employee getEmployee(int id);
//
//    public void deleteEmployee(int id);
}