package functional;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {

	public static void printNameAndActivities() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " " + activities);

		studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));

	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a : " + a + "\nb : " + b);
		};
		biConsumer.accept("Java 7", "Java 8");

		// Calculator using BiConsumer methods
		BiConsumer<Integer, Integer> addition = (x, y) -> {
			System.out.println("Addition = " + (x + y));
		};

		BiConsumer<Integer, Integer> sutraction = (x, y) -> {
			System.out.println("Subtraction = " + (x - y));
		};

		BiConsumer<Integer, Integer> multiplication = (x, y) -> {
			System.out.println("Multiplication = " + (x * y));
		};

		BiConsumer<Integer, Integer> division = (x, y) -> {
			System.out.println("Division = " + (x / y));
		};

		addition.andThen(sutraction).andThen(multiplication).andThen(division).accept(10, 5);
		
		printNameAndActivities();

	}

}
