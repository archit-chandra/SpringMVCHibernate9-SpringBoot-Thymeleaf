package com.example.crudmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudmvc.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employees;

    // load employees data
    @PostConstruct
    private void loadData() {
        Employee emp1 = new Employee(1, "Leslie", "Andrews", "leslie@gmail.com");
        Employee emp2 = new Employee(2, "Archit", "Chandra", "archit@gmail.com");
        Employee emp3 = new Employee(3, "Trisha", "Sharma", "trisha@gmail.com");
        employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String getAllEmployess(Model model) {
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}
