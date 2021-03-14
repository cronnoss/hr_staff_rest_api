package com.cronnoss.springboot.hr_staff_rest_api.entity;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posid")
    private int posid;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//            (fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE
//            , CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "depid")
    private Department department;

    @Column(name = "position_name")
    private String positionName;

//    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE
//            , CascadeType.REFRESH, CascadeType.DETACH})
//    @JoinTable(
//            name = "positions_employees"
//            , joinColumns = @JoinColumn(name = "posid")
//            , inverseJoinColumns = @JoinColumn(name = "empid"))
//    private List<Employee> employees;

    public Position() {
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }

//    public void addEmployeeToPosition(Employee employee) {
//        if (employees == null) {
//            employees = new ArrayList<>();
//        }
//        employees.add(employee);
//    }

    public int getPosid() {
        return posid;
    }

    public void setPosid(int posid) {
        this.posid = posid;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    @Override
    public String toString() {
        return "Position{" +
                "posid=" + posid +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}