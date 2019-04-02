package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    private static final String VAR_DEPARTMENT_ID = "/{departmentId}";

    @Autowired
    private DepartmentService service;

    @GetMapping("/all")
    public List<Department> getDepartmentAll() {
        return service.getDepartmentAll();
    }

    @PostMapping("/add")
    public Department saveDepartment(Department department) {
        return service.save(department);
    }

    @PutMapping(VAR_DEPARTMENT_ID)
    public Department updateDepartment(@PathVariable Long departmentId, Department department) {
        return service.update(departmentId, department);
    }

    @DeleteMapping(VAR_DEPARTMENT_ID)
    public void deleteDepartment(@PathVariable Long departmentId) {
        service.delete(departmentId);
    }

}
