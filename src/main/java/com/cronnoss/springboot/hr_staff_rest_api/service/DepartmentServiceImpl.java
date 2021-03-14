package com.cronnoss.springboot.hr_staff_rest_api.service;

import com.cronnoss.springboot.hr_staff_rest_api.dao.DepartmentDao;
import com.cronnoss.springboot.hr_staff_rest_api.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentDao.saveDepartment(department);
    }

    @Override
    @Transactional
    public Department getDepartment(int depid) {
        return departmentDao.getDepartment(depid);
    }

    @Override
    @Transactional
    public void deleteDepartment(int depid) {
        departmentDao.deleteDepartment(depid);
    }
}