package functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(4, 5));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println(maxBy.apply(5, 10));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println(minBy.apply(5, 10));

	}

}
