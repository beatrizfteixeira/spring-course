package beatrizfteixeira.cruddemo;

import beatrizfteixeira.cruddemo.entity.Student;
import beatrizfteixeira.cruddemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
		System.out.println("hellorr!");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			getAllStudents(studentDAO);
		};
	}

	public void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Vampeta", "Scarpa", "vamp@email.com");
		studentDAO.save(student);
		System.out.println(student);
	}

	public void readStudent(StudentDAO studentDAO) {
		Student student = new Student("Fubanga", "Modas", "fubs@gmail.com");
		studentDAO.save(student);
		System.out.println(student.getId());
		Integer id = student.getId();
		Student stu = studentDAO.findById(id);
		System.out.println(stu);
	}

	public void getAllStudents(StudentDAO studentDAO) {
		List<Student> listStudents = studentDAO.findAll();

		for (Student s : listStudents) {
			System.out.println(s);
		}
	}
}
