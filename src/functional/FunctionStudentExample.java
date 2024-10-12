package functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {

		Map<String, Double> studentsGradeMap = new HashMap<>();

		students.forEach(student -> {
			if (PredicateStudentExample.p.test(student)) {
				studentsGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentsGradeMap;
	});

	public static void main(String[] args) {

		Map<String, Double> studentMap = studentFunction.apply(StudentDataBase.getAllStudents());
		System.out.println(studentMap);

	}

}
