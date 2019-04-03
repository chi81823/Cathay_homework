package junit;

import com.example.Application;
import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService service;

    @Test
    public void saveDepartmentTest() {
        service.save(Department.Builder.create()
                                       .number("0001")
                                       .name("IT")
                                       .build());

        Assert.assertEquals(1, service.getDepartmentAll().size());
    }

    @Test
    public void updateDepartmentTest() {
        Department dep = service.update(1L, Department.Builder.create()
                                                              .number("0002")
                                                              .name("HR")
                                                              .build());

        Assert.assertEquals("HR", dep.getName());
    }

    @Test
    public void findDepartmentByIdTest() {
        Assert.assertNotNull(service.getDepartmentById(1L));
    }

    @Test
    public void deleteDepartmentByIdTest() {
        service.delete(1L);
        Assert.assertNull(service.getDepartmentById(1L));
    }
}
