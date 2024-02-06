package java8;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
