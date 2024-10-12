package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDataBase;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "Basketball", "Volleyball"));
		};
		
		Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println(studentSupplier.get());
		System.out.println();
		System.out.println(studentListSupplier.get());
	}

}
