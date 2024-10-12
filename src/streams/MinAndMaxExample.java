package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMaxExample {

	public static Optional<Integer> findMaxValue(List<Integer> integerList) {

		return integerList.stream().reduce((a, b) -> a > b ? a : b);
		// OR
		// return integerList.stream().max((x, y) -> Integer.compare(x, y));
		// OR
		// return integerList.stream().max(Integer::compare);
	}

	public static Optional<Integer> findMinValue(List<Integer> integerList) {

		// return integerList.stream().reduce((a, b) -> a < b ? a : b);
		// OR
		// return integerList.stream().min((x, y) -> Integer.compare(x, y));
		// OR
		return integerList.stream().min(Integer::compare);
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, -5, 8, 9);

		if (findMaxValue(integerList).isPresent()) {
			System.out.println("Max value : " + findMaxValue(integerList).get());
		}

		if (findMinValue(integerList).isPresent()) {
			System.out.println("Min Value : " + findMinValue(integerList).get());
		}
	}
}
