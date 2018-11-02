package com.lahey.week7challenge.configuration;

import com.lahey.week7challenge.entities.Department;
import com.lahey.week7challenge.entities.Employee;
import com.lahey.week7challenge.repositories.DepartmentRepository;
import com.lahey.week7challenge.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    DepartmentRepository departments;

    @Autowired
    EmployeeRepository employees;

    @Override
    public void run(String... strings) throws Exception{

        //create Employees
        Employee employee0 = new Employee("Elise", "Sales Representative");
        Employee employee1 = new Employee("Romeo", "Sales Representative");
        Employee employee2 = new Employee("Alfie", "Sales Manager");
        Employee employee3 = new Employee("Grumpy", "Deveoper");
        Employee employee4 = new Employee("Sneezy", "Senior Developer");
        Employee employee5 = new Employee("Happy", "Development Architect");
        Employee employee6 = new Employee("Rudolph", "Customer Service Representative");
        Employee employee7 = new Employee("Donner", "Customer Service Representative");
        Employee employee8 = new Employee("Blitzen", "Customer Service Manager");
        Employee employee9 = new Employee("Alice", "Administrator");


        //create Departments
        Department department0 = new Department("Sales");
        Department department1 = new Department("Product Development");
        Department department2 = new Department("Customer Service");
        Department department3 = new Department("Administration");

        //link Employees and Departments
        //set department field in employee
        //create HashSet of departmentEmployees
        //add set to department
//        HashSet<Employee> tempSet;

        //link Sales Employees
//        tempSet = new HashSet<Employee>();
        employee0.setDepartment(department0);
        department0.getEmployeeSet().add(employee0);
        employee1.setDepartment(department0);
        department0.getEmployeeSet().add(employee1);
        employee2.setDepartment(department0);
        department0.getEmployeeSet().add(employee2);

        departments.save(department0);
        employees.save(employee0);
        employees.save(employee1);
        employees.save(employee2);


//        employee3.setDepartment(department1);
//        department1.getEmployeeSet().add(employee3);
//        employee4.setDepartment(department1);
//        department1.getEmployeeSet().add(employee4);
//        employee5.setDepartment(department1);
//        department1.getEmployeeSet().add(employee5);
//
//        employee6.setDepartment(department2);
//        department2.getEmployeeSet().add(employee6);
//        employee7.setDepartment(department2);
//        department2.getEmployeeSet().add(employee7);
//        employee8.setDepartment(department2);
//        department2.getEmployeeSet().add(employee8);
//
//        employee3.setDepartment(department1);
//        department1.getEmployeeSet().add(employee3);
//        employee4.setDepartment(department1);
//        department1.getEmployeeSet().add(employee4);
//        employee5.setDepartment(department1);
//        department1.getEmployeeSet().add(employee5);






//        //add to department Repository
//        departments.save(department0);
//        departments.save(department1);
//        departments.save(department2);
//        departments.save(department3);
//
//        //save Employees to EmployeeRepository
//        employees.save(employee0);
//        employees.save(employee1);
//        employees.save(employee2);
//        employees.save(employee3);
//        employees.save(employee4);
//        employees.save(employee5);
//        employees.save(employee6);
//        employees.save(employee7);
//        employees.save(employee8);
//        employees.save(employee9);
//


    }//end  public void run(String... strings) throws Exception


}//end public class DataLoader implements CommandLineRunner