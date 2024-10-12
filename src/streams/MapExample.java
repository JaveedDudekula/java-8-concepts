package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class MapExample {

	public static List<String> namesList() {

		List<Student> studentList = StudentDataBase.getAllStudents();
		List<String> resultList = new ArrayList<>();

		studentList.forEach(student -> resultList.add(student.getName().toUpperCase()));

		return resultList;
	}

	public static List<String> namesListUsingStreams() {

		return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		System.out.println(namesList());
		System.out.println();
		System.out.println(namesListUsingStreams());

	}

}
