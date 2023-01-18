package yy_spring.components;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public final class Student {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private double grade;

	public Student() {
	}

	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", grade=" + grade +
				'}';
	}
}
