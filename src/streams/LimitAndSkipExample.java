package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipExample {

	public static Optional<Integer> limit(List<Integer> integerList) {

		return integerList.stream().limit(2).reduce((a, b) -> a + b);
		// Limits to process only two elements
	}

	public static Optional<Integer> skip(List<Integer> integerList) {

		return integerList.stream().skip(3).reduce((a, b) -> a + b); // Skips first three elements
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

		if (limit(integerList).isPresent()) {
			System.out.println(limit(integerList).get());
		}

		if (skip(integerList).isPresent()) {
			System.out.println(skip(integerList).get());
		}
	}

}
