package com.example.crudmvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudmvc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // add a method to sort employee by last name in ascending order
    List<Employee> findAllByOrderByLastNameAsc();
}
