package parallelstreams;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {

		Sum sum = new Sum();

		IntStream.rangeClosed(1, 10000).forEach(sum::performSum);
		System.out.println(sum.getTotal());

		sum.setTotal(0);

		IntStream.rangeClosed(1, 10000).parallel().forEach(sum::performSum);
		System.out.println(sum.getTotal()); // Parallel stream is printing false result
	}
}
