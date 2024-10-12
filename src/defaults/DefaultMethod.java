package defaults;

import java.util.Comparator;
import java.util.List;

import data.Student;
import data.StudentDataBase;

public class DefaultMethod {

	public static List<Student> sortByName(List<Student> studentList) {
		studentList.sort(Comparator.comparing(Student::getName));
		return studentList;
	}

	public static List<Student> comparatorChaining(List<Student> studentList) {
		// studentList.add(null); // Throws an exception as the list contains null value
		studentList.sort(Comparator.comparing(Student::getGradeLevel).thenComparing(Student::getName));
		return studentList;
	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		List<Student> namesSortedList = sortByName(studentList);
		System.out.println("Sorting by names");
		namesSortedList.forEach(System.out::println);
		System.out.println();

		List<Student> sortByGradeAndName = comparatorChaining(studentList);
		System.out.println("Sorting by gradeLevel and names using comparator chaining");
		sortByGradeAndName.forEach(System.out::println);
	}
}
