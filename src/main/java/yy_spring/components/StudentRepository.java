package yy_spring.components;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student> findByName(String name);

	List<Student> findByGradeGreaterThan(double grade);
	List<Student> findByGradeLessThanEqual(double grade);

}
