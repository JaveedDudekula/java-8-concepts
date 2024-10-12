package functional;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = (i) -> {
		return i % 2 == 0;
	};

	static Predicate<Integer> p1 = (i) -> i % 2 != 0;
	
	static Predicate<Integer> p2 = (i) -> i>=0;

	public static void main(String[] args) {

		System.out.println(p.test(4));
		System.out.println(p1.test(5));
		
		System.out.println(p.and(p1).test(10));
		System.out.println(p.or(p1).test(10));
		System.out.println(p.negate().test(10));
		
		System.out.println(p.or(p1).and(p2).test(5));
		System.out.println(p.or(p1).and(p2).negate().test(5));

	}

}
