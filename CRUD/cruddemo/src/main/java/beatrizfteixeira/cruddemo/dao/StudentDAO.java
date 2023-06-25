package beatrizfteixeira.cruddemo.dao;

import beatrizfteixeira.cruddemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public interface StudentDAO {

    public void save(Student student);
    public Student findById(Integer id);
}
