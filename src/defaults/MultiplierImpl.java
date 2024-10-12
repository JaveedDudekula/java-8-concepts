package defaults;

import java.util.List;
import java.util.Optional;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integerList) {
		Optional<Integer> integerOptional = integerList.stream().reduce((x, y) -> x * y);
		return integerOptional.get();
	}

	public int size(List<Integer> integerList) {
		System.out.println("Inside MultiplierImpl Class");
		return integerList.size();
	}
}
