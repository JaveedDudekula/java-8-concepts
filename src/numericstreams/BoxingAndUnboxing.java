package numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class BoxingAndUnboxing {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10).boxed().toList();
	}

	public static int unBoxing(List<Integer> integers) {
		return integers.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		System.out.println(boxing());
		System.out.println(unBoxing(boxing()));
	}
}
