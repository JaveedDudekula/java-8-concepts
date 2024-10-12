package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerate {
	
	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("Adam","Tom","Julie");
		stringStream.forEach(System.out::println);
		
		int num = 2;
		System.out.println("\nPowers of the number "+num);
		Stream.iterate(num, x -> x*num).limit(10).forEach(System.out::println);
		
		System.out.println("\nPrinting random 10 integers");
		
		Supplier<Integer> integer = new Random()::nextInt; 
		Stream.generate(integer).filter(x -> x>0).limit(10).forEach(System.out::println);
	}
}
