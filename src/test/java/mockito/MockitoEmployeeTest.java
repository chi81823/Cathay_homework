package mockito;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class MockitoEmployeeTest {

    @InjectMocks
    private EmployeeService service;

    @Mock
    private EmployeeRepository repository;

    @Test
    public void saveEmployeeTest() {
        Employee employee = Employee.Builder.create()
                                            .number("0001")
                                            .name("Darren")
                                            .departmentId(2L)
                                            .gender("M")
                                            .telephone("0912345678")
                                            .address("新北市")
                                            .age(28)
                                            .build();

        Mockito.when(repository.save(any(Employee.class))).thenReturn(employee);

        Employee returned = service.save(employee);

        Assert.assertEquals(employee, returned);
    }

    @Test
    public void updateEmployeeTest() {
        Employee employee = Employee.Builder.create()
                                            .id(1L)
                                            .number("0001")
                                            .name("Darren")
                                            .departmentId(2L)
                                            .gender("M")
                                            .telephone("0912345678")
                                            .address("新北市")
                                            .age(28)
                                            .build();

        Employee update = Employee.Builder.create()
                                          .number("0001")
                                          .name("Lisa")
                                          .departmentId(2L)
                                          .gender("F")
                                          .telephone("0912345678")
                                          .address("新北市")
                                          .age(28)
                                          .build();

        Mockito.when(repository.findOne(employee.getId())).thenReturn(employee);
        Mockito.when(service.update(employee.getId(), update)).thenReturn(update);

        Assert.assertNotEquals(employee, update);
    }

    @Test
    public void deleteEmployeeTest() {
        Mockito.when(repository.findOne(1L)).thenReturn(null);

        service.delete(1L);
    }

    @Test
    public void searchEmployeeTest() {
        List<Employee> employeeList = new ArrayList<>();

        Mockito.when(service.search("01", "Dar", 28, 2L, null, null)).thenReturn(employeeList);

        Assert.assertNotNull(employeeList);
    }
}
