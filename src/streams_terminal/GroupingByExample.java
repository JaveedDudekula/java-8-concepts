package streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class GroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(studentMap);
	}

	public static void customizedGroupBy() {
		Map<String, List<Student>> customStudentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "OUTSTANDING" : "SMART"));
		System.out.println(customStudentMap);
	}

	public static void twoLevelGrouping() {
		Map<Integer, Map<String, List<Student>>> studentTwoLevelMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "OUTSTANDING" : "SMART")));
		System.out.println(studentTwoLevelMap);
	}

	public static void twoLevelGrouping1() {
		Map<String, Integer> groupNameAndNoteBooks = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		groupNameAndNoteBooks.forEach((x, y) -> System.out.println(x + " " + y));
	}

	public static void threeArgumentGroupBy() {
		LinkedHashMap<Integer, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, LinkedHashMap::new, Collectors.toSet()));
		studentLinkedHashMap.forEach((x, y) -> System.out.println(x + " " + y));
	}

	public static void maxByGpaByGradeLevel() {
		Map<Integer, Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		studentMap.forEach((x, y) -> System.out.println(x + " " + y.get()));
	}

	public static void minByGpaByGradeLevel() {
		Map<Integer, Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
		studentMap.forEach((x, y) -> System.out.println(x + " " + y.get()));
	}

	public static void main(String[] args) {

		System.out.println("groupStudentsByGender()");
		groupStudentsByGender();
		System.out.println();

		System.out.println("customizedGroupBy()");
		customizedGroupBy();
		System.out.println();

		System.out.println("twoLevelGrouping()");
		twoLevelGrouping();
		System.out.println();

		System.out.println("twoLevelGrouping1()");
		twoLevelGrouping1();
		System.out.println();

		System.out.println("threeArgumentGroupBy()");
		threeArgumentGroupBy();
		System.out.println();

		System.out.println("maxByGpaByGradeLevel()");
		maxByGpaByGradeLevel();
		System.out.println();

		System.out.println("minByGpaByGradeLevel()");
		minByGpaByGradeLevel();
	}
}
