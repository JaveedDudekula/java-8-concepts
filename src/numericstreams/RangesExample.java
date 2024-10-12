package numericstreams;

import java.util.stream.IntStream;

public class RangesExample {

	public static void main(String[] args) {

		System.out.println("Range count : " + IntStream.range(1, 50).count());
		IntStream.range(1, 50).forEach(num -> System.out.print(num + ", "));

		System.out.println();

		System.out.println("Range closed count : " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(num -> System.out.print(num + ", "));

		System.out.println("\n");

		IntStream.rangeClosed(1, 10).asDoubleStream().forEach(num -> System.out.print(num + " "));
	}
}
