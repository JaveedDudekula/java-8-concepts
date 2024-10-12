package streams_terminal;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class SumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}

	public static double avg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println();
		System.out.println(avg());
	}
}
