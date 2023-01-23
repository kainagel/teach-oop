package yy_spring.components;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

@RestController
public class StudentController {

	private final StudentRepository db;

	public StudentController(StudentRepository db) {
		this.db = db;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name", required = false) String p) {
		return "Hallo " + p;
	}

	@RequestMapping(value = "/custom", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> custom(
			@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language) {
		System.out.println(language);
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Custom", "Hallo");
		return new ResponseEntity<>(Map.of("result", "Hallo"), headers, HttpStatus.I_AM_A_TEAPOT);
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

	@GetMapping("/students/search/{search}")
	public List<Student> add(@PathVariable("search") String search) {
		return db.findByLetter(search);
	}

}
