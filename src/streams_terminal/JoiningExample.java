package streams_terminal;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class JoiningExample {

	public static String joining1() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}

	public static String joining2() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(" "));
	}

	public static String joining3() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining(" ", "[", "]")); // joining(delimiter, prefix, suffix)
	}

	public static void main(String[] args) {

		System.out.println(joining1());
		System.out.println();
		System.out.println(joining2());
		System.out.println();
		System.out.println(joining3());

	}
}
