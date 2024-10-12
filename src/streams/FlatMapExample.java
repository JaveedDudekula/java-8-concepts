package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class FlatMapExample {

	public static List<List<String>> activitiesList() {
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).collect(Collectors.toList());
	}

	public static List<String> activitiesListUsingFlatMap() {

		return StudentDataBase.getAllStudents().stream().map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.collect(Collectors.toList());
	}

	public static List<String> uniqueActivitiesListUsingDistinct() {

		return StudentDataBase.getAllStudents().stream().map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct().sorted().collect(Collectors.toList());
	}
	
	public static long uniqueActivitiesCount() {

		return StudentDataBase.getAllStudents().stream().map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct().count();
	}

	public static void main(String[] args) {

		System.out.println(activitiesList());
		System.out.println();
		System.out.println(activitiesListUsingFlatMap());
		System.out.println();
		System.out.println(uniqueActivitiesListUsingDistinct());
		System.out.println();
		System.out.println("Number of activities : "+uniqueActivitiesCount());
	}

}
