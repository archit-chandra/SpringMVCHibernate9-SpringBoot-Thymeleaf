package com.example.crudmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudmvc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
