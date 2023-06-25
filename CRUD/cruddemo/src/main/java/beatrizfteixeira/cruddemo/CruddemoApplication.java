package beatrizfteixeira.cruddemo;

import beatrizfteixeira.cruddemo.entity.Student;
import beatrizfteixeira.cruddemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
		System.out.println("hellorr!");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	public void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Claudette", "Gregotica", "clau@email.com");
		studentDAO.save(student);
		student.toString();
	}
}
