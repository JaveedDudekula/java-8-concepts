package optional;

import java.util.Optional;

public class OptionalPresent {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable("Text");

		// isPresent
		System.out.println(optional.isPresent() ? optional.get() : "Empty");

		// ifPresent - accepts consumer
		optional.ifPresent(System.out::println);

		// ifPresentOrElse
		optional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));
	}
}
