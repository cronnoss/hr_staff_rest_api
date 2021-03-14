package com.cronnoss.springboot.hr_staff_rest_api.dao;

import com.cronnoss.springboot.hr_staff_rest_api.entity.Department;

import java.util.List;

public interface DepartmentDao {
    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public Department getDepartment(int depid);

    public void deleteDepartment(int depid);
}