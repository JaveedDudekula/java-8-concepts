package streams;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class FindAnyAndFindFirst {

	public static Optional<Student> findAnyStudent() {

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();
	}

	public static Optional<Student> findFirstStudent() {

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 4.1).findFirst();
	}

	public static void main(String[] args) {

		Optional<Student> studentFindAny = findAnyStudent();
		System.out
				.println(studentFindAny.isPresent() ? "Student Found : " + studentFindAny.get() : "Student not found");

		Optional<Student> studentFindFirst = findFirstStudent();
		System.out.println(
				studentFindFirst.isPresent() ? "Student Found : " + studentFindFirst.get() : "Student not found");
	}
}
