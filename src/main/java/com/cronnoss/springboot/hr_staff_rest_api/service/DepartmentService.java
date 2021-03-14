package com.cronnoss.springboot.hr_staff_rest_api.service;

import com.cronnoss.springboot.hr_staff_rest_api.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public Department getDepartment(int depid);

    public void deleteDepartment(int depid);
}