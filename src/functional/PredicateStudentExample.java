package functional;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p1 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentsByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(student -> {
			if (p.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(student -> {
			if (p1.and(p).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void main(String[] args) {

		filterStudentsByGradeLevel();
		System.out.println();
		filterStudentsByGpa();
		System.out.println();
		filterStudents();

	}

}
