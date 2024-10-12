package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class leetcode {

	public static String[] uncommonFromSentences(String s1, String s2) {

		List<String> s1List = new ArrayList<>();
		List<String> s2List = new ArrayList<>();

		if (s1 != null) {
			s1List = Arrays.stream(s1.split(" ")).map(String::toLowerCase).sorted().collect(Collectors.toList());
		}

		if (s2 != null) {
			s2List = Arrays.stream(s2.split(" ")).map(String::toLowerCase).sorted().collect(Collectors.toList());
		}

		List<String> totalList = new ArrayList<>();

		totalList.addAll(s1List);
		totalList.addAll(s2List);

		totalList = removeCommons(totalList.stream().filter(Objects::nonNull).sorted().collect(Collectors.toList()));

		String[] resultArr = totalList.toArray(new String[0]);
		return resultArr;
	}

	public static List<String> removeCommons(List<String> inputList) {
		int i = 0;
		while (i < inputList.size() - 1) {
			if (inputList.get(i).equals(inputList.get(i + 1))) {
				String value = inputList.get(i);
				while (inputList.contains(value)) {
					inputList.remove(value);
				}
			} else {
				i++;
			}
		}
		return inputList;
	}

	public static void main(String[] args) {

		System.out.println(uncommonFromSentences("s z z z s", "s z ejt"));

	}

}
