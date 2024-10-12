package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class FilterExample {

	public static List<Student> filterStudentsByGender() {

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		filterStudentsByGender().forEach(System.out::println);
	}

}
