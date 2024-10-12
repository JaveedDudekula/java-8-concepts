package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalMapFilter {

	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
	}

	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() >= 3.5).map(Student::getName)
				.ifPresent(s -> System.out.println(s));
	}

	public static void main(String[] args) {

		optionalFilter();
		optionalMap();
	}
}
