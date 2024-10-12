package streams;

import data.Student;
import data.StudentDataBase;

public class MapReduceExample {

	public static int numberOfNoteBooks() {

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel() >= 3)
				.map(Student::getNoteBooks).reduce(0, (a, b) -> a + b); // Here 0 is initial value
	}

	public static void main(String[] args) {

		System.out.println("Total number of notebooks : " + numberOfNoteBooks());

	}

}
