package parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxed {

	public static int sequentialSum(List<Integer> integerList) {
		
		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().reduce(0, (x,y) -> x+y);
		System.out.println("Sequential stream duration : "+(System.currentTimeMillis()-startTime));
		return sum;
	}
	
public static int parallelSum(List<Integer> integerList) {
		
		long startTime = System.currentTimeMillis();
		int sum = integerList.parallelStream().reduce(0, (x,y) -> x+y);
		System.out.println("Parallel stream duration : "+(System.currentTimeMillis()-startTime));
		return sum;
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
		sequentialSum(integerList);
		parallelSum(integerList);
	}
}
