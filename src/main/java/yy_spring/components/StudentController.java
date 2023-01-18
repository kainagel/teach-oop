package yy_spring.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;
import java.util.stream.StreamSupport;

@RestController
public class StudentController {

	private final StudentRepository db;

	public StudentController(StudentRepository db) {
		this.db = db;
	}

	@GetMapping("/students")
	public List<Student> list() {
		Iterable<Student> all = db.findAll();
		return StreamSupport.stream(all.spliterator(), false).toList();
	}

	@GetMapping("/students/byGrade/{grade}")
	public List<Student> byGrade(@PathVariable("grade") double grade) {
		return db.findByGradeLessThanEqual(grade);
	}

	@GetMapping("/students/add/{name}/{grade}")
	public Student add(@PathVariable("name") String name, @PathVariable("grade") double grade) {
		Student student = new Student(name, grade);
		return db.save(student);
	}


}
