package streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class PartitioningByExample {

	static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;

	public static void partitioningBy1() {
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate));
		studentMap.forEach((x, y) -> System.out.println(x + " " + y));
	}

	public static void partitioningBy2() {
		Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
		studentMap.forEach((x, y) -> System.out.println(x + " " + y));
	}

	public static void main(String[] args) {

		System.out.println("partitioningBy1()");
		partitioningBy1();
		System.out.println();

		System.out.println("partitioningBy2()");
		partitioningBy2();
	}
}
