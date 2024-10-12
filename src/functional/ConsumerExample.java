package functional;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

	public static void printName() {

		System.out.println();
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);
	}

	public static void printNameAndActivities() {

		System.out.println();
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c3.andThen(c4)); // CONSUMER CHAINING

	}

	public static void printNameAndActivitiesUsingCondition() {

		System.out.println();
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.stream().filter(student -> student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
				.forEach(student -> c3.andThen(c4).accept(student));
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
		c1.accept("hello");

		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}

}
