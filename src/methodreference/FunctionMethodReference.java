package methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();

	static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

	public static void main(String[] args) {

		System.out.println(toUpperCaseLambda.apply("java 8"));
		System.out.println(toUpperCaseMethodRef.apply("java 8"));

	}

}
