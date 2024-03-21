package com.sashikanta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sashikanta.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
