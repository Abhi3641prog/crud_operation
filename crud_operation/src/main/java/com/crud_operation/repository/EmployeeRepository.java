package com.crud_operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_operation.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
