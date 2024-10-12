package numericstreams;

import java.util.stream.IntStream;

public class NumericStreamMap {

	public static Double mapToDouble() {

		return IntStream.rangeClosed(1, 5).mapToDouble((i) -> i).sum();
	}

	public static void main(String[] args) {

		System.out.println(mapToDouble());
	}
}
