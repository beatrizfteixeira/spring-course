package beatrizfteixeira.cruddemo.dao;

import beatrizfteixeira.cruddemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);
    public Student findById(Integer id);
    public List<Student> findAll();
    public List<Student> findByLastName(String lastName);
    public void update(Student student);

    public void deleteById(Integer id);
}
