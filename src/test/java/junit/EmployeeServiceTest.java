package junit;

import com.example.Application;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService service;
    @Autowired
    private EmployeeRepository repo;

    @Test
    public void saveEmployeeTest() {
        service.save(Employee.Builder.create()
                                     .number("0001")
                                     .name("Darren")
                                     .departmentId(2L)
                                     .gender("M")
                                     .telephone("0912345678")
                                     .address("新北市")
                                     .age(28)
                                     .build());

        Assert.assertEquals(1, service.getEmployeeAll().size());
    }

    @Test
    public void updateEmployeeTest() {
        Employee emp = service.update(1L, Employee.Builder.create()
                                                          .number("0002")
                                                          .name("Lisa")
                                                          .departmentId(2L)
                                                          .gender("F")
                                                          .telephone("0987654321")
                                                          .address("新北市")
                                                          .age(25)
                                                          .build());

        Assert.assertEquals("Lisa", emp.getName());
    }

    @Test
    public void findEmployeeById() {
        Assert.assertNotNull(service.getEmployeeById(1L));
    }

    @Test
    public void deleteEmployeeByIdTest() {
        service.delete(1L);
        Assert.assertNull(service.getEmployeeById(1L));
    }

    @Test
    public void searchEmployeeTest() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.Builder.create()
                                         .number("0001").name("Darren1").departmentId(2L).gender("M")
                                         .telephone("0912345678").address("新北市").age(25).build());
        employeeList.add(Employee.Builder.create()
                                         .number("0002").name("Darren2").departmentId(2L).gender("M")
                                         .telephone("0987654321").address("新北市").age(25).build());
        employeeList.add(Employee.Builder.create()
                                         .number("0003").name("Darren3").departmentId(2L).gender("M")
                                         .telephone("0912345673").address("新北市").age(25).build());
        employeeList.add(Employee.Builder.create()
                                         .number("0004").name("Darren4").departmentId(2L).gender("M")
                                         .telephone("0912345674").address("新北市").age(25).build());
        employeeList.add(Employee.Builder.create()
                                         .number("0011").name("Darren11").departmentId(2L).gender("M")
                                         .telephone("0912345675").address("新北市").age(25).build());


        repo.save(employeeList);

        List<Employee> employees = service.search("01", "ren", 25, 2L, 0, 1);

        Assert.assertEquals(1, employees.size()); //限制search 1頁1筆資料，所以只會是1

    }


}
