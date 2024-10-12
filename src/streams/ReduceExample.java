package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class ReduceExample {

	static List<Student> studentList = StudentDataBase.getAllStudents();

	public static int arrayProduct(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> a * b); // HERE 1 IS INITIAL VALUE
	}

	public static int arraySum(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a, b) -> a + b); // HERE 0 IS INITIAL VALUE
	}

	public static Optional<Integer> arraySumWithoutInitialValue(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a + b);
	}

	public static Optional<Student> getStudentWithHighestGpa() {
		return studentList.stream().reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Product : " + arrayProduct(integers));
		System.out.println("Sum : " + arraySum(integers) + "\n");

		Optional<Integer> result = arraySumWithoutInitialValue(integers);
		if (result.isPresent()) {
			System.out.println(result.get());
		}

		Optional<Student> studentResult = getStudentWithHighestGpa();
		if (studentResult.isPresent()) {
			System.out.println(studentResult.get());
		}
	}
}
