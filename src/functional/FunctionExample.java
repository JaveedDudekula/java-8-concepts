package functional;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> function = (name) -> name.toUpperCase();

	static Function<String, String> addSomeString = (name) -> name.concat(" features");

	public static void main(String[] args) {

		System.out.println(function.apply("java 8"));
		
		System.out.println(function.andThen(addSomeString).apply("java 8"));
		
		System.out.println(function.compose(addSomeString).apply("java 8"));
	}

}
