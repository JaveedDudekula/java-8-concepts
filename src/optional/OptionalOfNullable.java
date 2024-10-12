package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalOfNullable {

	public static Optional<String> getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
	    Optional<String> stringOptional = Optional.ofNullable(student.getName());

		// IF THE GIVEN VALUE IS NULL, THEN OPTIONAL OFNULLABLE RETURNS Optional.empty
		// instead of null pointer exception
		// Optional<String> stringOptional = Optional.ofNullable(null);
		return stringOptional;
	}

	public static void main(String[] args) {

		System.out.println(getStudentName());
	}
}
