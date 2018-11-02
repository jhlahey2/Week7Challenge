package com.lahey.week7challenge.controllers;

import com.lahey.week7challenge.repositories.DepartmentRepository;
import com.lahey.week7challenge.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    DepartmentRepository departments;

    @Autowired
    EmployeeRepository employees;

    @RequestMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/listdepartments")
    public String listDepartments(Model model) {

        model.addAttribute("departments", departments.findAll());

        return "listdepartments";
    }

    @RequestMapping("/listemployees")
    public String listEmployees(Model model) {

        model.addAttribute("employees", employees.findAll());

        return "listemployees";
    }

    @RequestMapping("/newdepartment")
    public String newDepartment(Model model) {

        return "index";
    }

    @RequestMapping("/newemployee")
    public String newEmployee(Model model) {

        return "index";
    }



}//end public class HomeController
