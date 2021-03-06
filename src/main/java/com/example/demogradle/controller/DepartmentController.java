package com.example.demogradle.controller;

import com.example.demogradle.entity.Department;
import com.example.demogradle.error.DepartmentNotFoundException;
import com.example.demogradle.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Controller
@RestController
public class DepartmentController {

    //Property Dependency injection
    @Autowired
    private DepartmentService departmentService;

    //Adding Loggers with slf4j
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    private Object DepartmentDto;


    //Creating Database
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside SaveDepartment of DepartmentController");
        LOGGER.trace("You're now in Inside fetchDepartmentById of DepartmentController");
        return departmentService.saveDepartment(department);
    }


    //Retrieve all the department List
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        LOGGER.trace("You're now in Inside fetchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentList();
    }
    //Retrieve Department By Id
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside fetchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentById(departmentId);
    }
    //Deleting Department
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        LOGGER.trace("You're now in Inside deleteDepartmentById of DepartmentController");
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully.";
    }
    //Updating Department Contents by Id
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department)
    {
        LOGGER.info("Inside updateDepartment of DepartmentController");
        LOGGER.trace("You're now in Inside updateDepartment of DepartmentController");
        return departmentService.updateDepartment(departmentId,department);
    }

    //Fetching Info by Property Name
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Inside fetchDepartmentByName of DepartmentController");
        LOGGER.trace("You're now in Inside fetchDepartmentByName of DepartmentController");
        return  departmentService.fetchDepartmentByName(departmentName);
    }



}
