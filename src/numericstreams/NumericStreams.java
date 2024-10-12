package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreams {

	public static int sumOfNumbers(List<Integer> integers) {
		
		return integers.stream().reduce(0, (x, y) -> x + y);
	}

	public static int sumOfNumbersIntStream(List<Integer> integers) {

		return IntStream.rangeClosed(integers.get(0), integers.get(integers.size() - 1)).sum();
	}
	
	public static int sumOfNumbersIntStream() {
		
		return IntStream.rangeClosed(1, 10).sum();
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(sumOfNumbers(integers));
		System.out.println();
		System.out.println(sumOfNumbersIntStream(integers));
		System.out.println();
		System.out.println(sumOfNumbersIntStream());
	}

}
