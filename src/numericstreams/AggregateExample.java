package numericstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AggregateExample {

	public static void main(String[] args) {

		System.out.println(IntStream.rangeClosed(1, 50).sum());
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 50).max().getAsInt());
		System.out.println(IntStream.rangeClosed(1, 50).min().getAsInt());
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 50).average().getAsDouble());

		// Max element from list - other ways
		List<Integer> integers = Arrays.asList(1, 8, 9, 6, 5, 4, 3);
		System.out.println();

		System.out.println(integers.stream().reduce((x, y) -> (x > y) ? x : y).get());
		System.out.println(Collections.max(integers));
		
		System.out.println(Collections.min(integers));
	}
}
