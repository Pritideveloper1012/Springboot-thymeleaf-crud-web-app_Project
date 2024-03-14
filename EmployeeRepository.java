package com.practice.myCompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.myCompany.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
