package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.9;

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3)
				.peek(student -> System.out.println("After 1st filter : " + student)).filter(studentPredicate)
				.peek(student -> System.out.println("After 2st filter : " + student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);

	}

}
