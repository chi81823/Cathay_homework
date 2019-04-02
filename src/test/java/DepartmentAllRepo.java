import com.example.repository.DepartmentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DepartmentAllRepo.class)
@WebAppConfiguration
public class DepartmentAllRepo extends AbstractJUnit4SpringContextTests {


    @Autowired
    private DepartmentRepository departmentRepo;

    @Test
    public void test() {
        Assert.assertNotNull(departmentRepo.findAll());
    }
}
