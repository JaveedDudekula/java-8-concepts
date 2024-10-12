package streams_terminal;

import java.util.stream.Collectors;

import data.StudentDataBase;

public class CountingExample {

	public static long counting() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)
				.collect(Collectors.counting());
		// OR
		// return StudentDataBase.getAllStudents().stream().count();
	}

	public static void main(String[] args) {
		System.out.println(counting());
	}
}
