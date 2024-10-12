package parallelstreams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class ParallelStream1 {

	public static List<String> sequentialStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential stream duration : " + (endTime - startTime));
		return studentActivities;
	}

	public static List<String> parallelStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel stream duration : " + (endTime - startTime));
		return studentActivities;
	}

	public static void main(String[] args) {

		sequentialStudentActivities();
		parallelStudentActivities();
		System.out.println(sequentialStudentActivities());
		System.out.println(parallelStudentActivities());
	}
}
