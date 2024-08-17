package com.entity_relationships.one_to_one.repositories;

import com.entity_relationships.one_to_one.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

