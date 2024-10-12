package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalOrElse {

	public static String optionalOrElse() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElse("Default");
	}

	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElseGet(() -> "Default");
		// OrElseGet takes only supplier as parameter
	}

	public static String optionalOrElseThrow() {
		// Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available"));
	}

	public static void main(String[] args) {

		System.out.println("OptionalOrElse : " + optionalOrElse());
		System.out.println("OptionalOrElseGet : " + optionalOrElseGet());
		System.out.println("OptionalOrElseThrow : " + optionalOrElseThrow());
	}
}
