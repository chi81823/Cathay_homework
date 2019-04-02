package com.example.service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public List<Department> getDepartmentAll() {
        return repo.findAll();
    }

    public Department getDepartmentById(Long Id) {
        return repo.findOne(Id);
    }

    public Department save(Department department) {
        return repo.save(department);
    }

    public Department update(Long id, Department department) {
        Department dep = getDepartmentById(id);
        dep.setName(department.getName());
        return repo.save(dep);
    }

    public void delete(Long id) {
        repo.delete(id);
    }

}
