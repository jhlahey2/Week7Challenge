package com.lahey.week7challenge.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department" ,cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;

    //constructors

    public Department() {

        this.employeeSet = new HashSet<Employee>();
    }

    public Department(String name) {
        this.departmentName = name;
        this.employeeSet = new HashSet<Employee>();
    }

    //getters && setters

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

}//end public class Department
