package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsComparator {

	public static List<Student> sortStudentsByName() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.sorted(Comparator.comparing(Student::getGradeLevel)).collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpa() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpaDesc() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println("Students sorted by name : ");
		sortStudentsByName().forEach(System.out::println);
		System.out.println();
		System.out.println("Students sorted by GPA : ");
		sortStudentsByGpa().forEach(System.out::println);
		System.out.println();
		System.out.println("Students sorted by GPA in descending order : ");
		sortStudentsByGpaDesc().forEach(System.out::println);

	}

}
