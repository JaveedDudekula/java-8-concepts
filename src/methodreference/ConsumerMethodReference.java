package methodreference;

import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerMethodReference {

	static Consumer<Student> c1 = (student) -> System.out.println(student);

	static Consumer<Student> c2 = System.out::println;

	static Consumer<Student> c3 = (student) -> System.out.println(student.getName() + " " + student.getActivities());

	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(c1);
		System.out.println();
		StudentDataBase.getAllStudents().forEach(c2);
		System.out.println();
		StudentDataBase.getAllStudents().forEach(c3);

	}

}
