package com.escape.h2.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.escape.h2.database.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {
}