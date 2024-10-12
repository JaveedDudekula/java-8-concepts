package lambda_expressions;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {

		// PRIOR JAVA 8

		Comparator<Integer> comparator = new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 0 -> o1==o2, 1 -> o1>o2, -1 -> o1<o2
			}
		};
		
		System.out.println("Result 1 : " + comparator.compare(5, 3));
		
		
		// JAVA 8 LAMBDA 
		
		Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
		
		System.out.println("Result 2 : "+comparatorLambda.compare(6, 8));

	}

}
