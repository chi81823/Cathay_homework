package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private static final String VAR_EMPLOYEE_ID = "/{employeeId}";

    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    public List<Employee> getEmployeeAll() {
        return service.getEmployeeAll();
    }

    @PostMapping("/add")
    public Employee saveEmployee(Employee employee) {
        return service.save(employee);
    }

    @PutMapping(VAR_EMPLOYEE_ID)
    public Employee updateEmployee(@PathVariable Long employeeId, Employee employee) {
        return service.update(employeeId, employee);
    }

    @GetMapping("/search")
    public List<Employee> searchEmployee(@RequestParam(required = false) String number,
                                         @RequestParam(required = false) String name,
                                         @RequestParam(required = false) Integer age,
                                         @RequestParam(required = false) Long departmentId,
                                         @RequestParam(required = false) Integer page,
                                         @RequestParam(required = false) Integer perPage) {

        return service.search(number, name, age, departmentId, page, perPage);

    }

    @DeleteMapping(VAR_EMPLOYEE_ID)
    public void deleteEmployee(@PathVariable Long employeeId) {
        service.delete(employeeId);
    }
}
