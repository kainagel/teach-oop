package yy_spring.components;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student> findByName(String name);

	List<Student> findByGradeGreaterThan(double grade);
	List<Student> findByGradeLessThanEqual(double grade);

	@Query(value = "SELECT * FROM STUDENT WHERE NAME LIKE ?1%", nativeQuery = true)
	List<Student> findByLetter(String letter);

}
