package mockito;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDepartmentTest {

    @InjectMocks
    private DepartmentService service;

    @Mock
    private DepartmentRepository repository;

    @Test
    public void saveDepartmentTest() {
        Department department = Department.Builder.create()
                                                  .number("0001")
                                                  .name("IT")
                                                  .build();

        Mockito.when(repository.save(any(Department.class))).thenReturn(department);

        Department returned = service.save(department);

        Assert.assertEquals(department, returned);
    }

    @Test
    public void updateDepartmentTest() {
        Department department = Department.Builder.create()
                                                  .id(1L)
                                                  .number("0001")
                                                  .name("IT")
                                                  .build();

        Department update = Department.Builder.create()
                                              .id(1L)
                                              .number("0002")
                                              .name("HR")
                                              .build();

        Mockito.when(repository.findOne(department.getId())).thenReturn(department);
        Mockito.when(service.update(department.getId(), update)).thenReturn(update);

        Assert.assertNotEquals(department, update);
    }

    @Test
    public void deleteDepartmentTest() {
        Mockito.when(repository.findOne(1L)).thenReturn(null);

        service.delete(1L);
    }
}
