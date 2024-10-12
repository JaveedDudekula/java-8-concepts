package lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 9, 10);

		// IMPERATIVE

		List<Integer> uniqueList = new ArrayList<>();
		for (Integer integer : integerList) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println(uniqueList);

		// DECLARATIVE

		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);

	}

}
