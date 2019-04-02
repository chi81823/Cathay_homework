package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getEmployeeAll() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findOne(id);
    }

    public Employee save(Employee emp) {
        emp.setCreateDate(getTimeStampNow());
        emp.setModifyDate(getTimeStampNow());
        return repo.save(emp);
    }

    public Employee update(Long id, Employee employee) {
        Employee emp = getEmployeeById(id);
        emp.setName(employee.getName());
        emp.setDepartmentId(employee.getDepartmentId());
        emp.setGender(employee.getGender());
        emp.setTelephone(employee.getTelephone());
        emp.setAddress(employee.getAddress());
        emp.setAge(employee.getAge());
        emp.setModifyDate(getTimeStampNow());
        return repo.save(emp);
    }

    public void delete(Long id) {
        repo.delete(id);
    }

    public List<Employee> search(String number, String name, Integer age, Long departmentId,
                                 Integer page, Integer perPage) {
        Employee emp = Employee.Builder.create()
                                       .number(number)
                                       .name(name)
                                       .age(age)
                                       .departmentId(departmentId)
                                       .build();

        ExampleMatcher customEmployeeMatcher =
                ExampleMatcher.matchingAll()
                              .withMatcher("number", ExampleMatcher.GenericPropertyMatchers.contains())
                              .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                              .withMatcher("age", ExampleMatcher.GenericPropertyMatchers.contains())
                              .withMatcher("departmentId", ExampleMatcher.GenericPropertyMatchers.contains())
                              .withIgnoreCase("id");

        Example<Employee> example = Example.of(emp, customEmployeeMatcher);

        Pageable pageable;

        if (page != null && perPage != null) {
            pageable = new PageRequest(page, perPage);
            Page<Employee> employeePage = repo.findAll(example, pageable);
            return employeePage.getContent();

        } else {
            return repo.findAll(example);

        }

    }

    private static Timestamp getTimeStampNow() {
        return new Timestamp(System.currentTimeMillis());
    }
}
