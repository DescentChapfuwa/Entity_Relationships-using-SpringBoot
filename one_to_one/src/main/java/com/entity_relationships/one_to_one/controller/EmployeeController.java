package com.entity_relationships.one_to_one.controller;

import com.entity_relationships.one_to_one.entities.Employee;
import com.entity_relationships.one_to_one.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employeedetails){
        repository.save(employeedetails);
        return ResponseEntity.ok("Data successfully saved");
    }
}
