package streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class MappingExample {

	public static void main(String[] args) {

		List<String> studentNames = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println(studentNames);

	}
}
