package mockito;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockitoEmployeeTest {

    @Mock
    private EmployeeService service;

    @Test
    public void asd() {

        List<Employee> employeeList = new ArrayList<>();

        Mockito.when(service.getEmployeeAll()).thenReturn(employeeList);

        Assert.assertNotNull(employeeList);

    }
}
