package repository;

import com.example.Application;
import com.example.repository.DepartmentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository repo;

    @Test
    public void isImplement() {
        Assert.assertNotNull(repo.findAll());
    }

}
