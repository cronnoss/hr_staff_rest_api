package com.cronnoss.springboot.hr_staff_rest_api.dao;

import com.cronnoss.springboot.hr_staff_rest_api.entity.Department;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DepartmentDAOImpl implements DepartmentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Department> getAllDepartments() {

//        Session session = entityManager.unwrap(Session.class);
//        Query<Department> query = session.createQuery("from Department"
//                , Department.class);
//        List<Department> allDepartments = query.getResultList();

        Query query = entityManager.createQuery("from Department", Department.class);
        List<Department> allDepartments = query.getResultList();
        return allDepartments;
    }

    @Override
    public void saveDepartment(Department department) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(department);

        Department newDepartment = entityManager.merge(department);
        department.setDepid(newDepartment.getDepid());
    }

    @Override
    public Department getDepartment(int depid) {
//        Session session = entityManager.unwrap(Session.class);
//        Department department = session.get(Department.class, depid);

        Department department = entityManager.find(Department.class, depid);
        return department;
    }

    @Override
    public void deleteDepartment(int depid) {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Department> query = session.createQuery("delete from Department " +
//                "where depid =:depid");
//        query.setParameter("depid", depid);
//        query.executeUpdate();

        Query query = entityManager.createQuery("delete from Department " +
                "where depid =:depid");
        query.setParameter("depid", depid);
        query.executeUpdate();
    }
}