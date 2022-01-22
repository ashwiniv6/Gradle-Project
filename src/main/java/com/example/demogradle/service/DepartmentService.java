package com.example.demogradle.service;

import com.example.demogradle.entity.Department;
import com.example.demogradle.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public  void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
