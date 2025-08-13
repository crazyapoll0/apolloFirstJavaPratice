package chapter23;

import java.util.Optional;
import java.util.stream.IntStream;

public class Ex06_PreTerminal {

	public static void main(String[] args) {
		int sum = IntStream.of(1, 3, 5, 7, 9)
				.sum();
		System.out.println("sum = " + sum);

		long cnt = IntStream.of(1, 3, 5, 7, 9)
				.count();
		System.out.println("count = " + cnt);

		IntStream.of(1, 3, 5, 7, 9)
			.average()
			.ifPresent(avg -> System.out.println("avg =" + avg));

		IntStream.of(1, 3, 5, 7, 9)
			.min()
			.ifPresent(min -> System.out.println("min =" + min));

		IntStream.of(1, 3, 5, 7, 9)
			.max()
			.ifPresent(max -> System.out.println("max =" + max));
		
		Optional<Integer> op = Optional.of(10);
//		Integer a = 10;
//		if(a != null) {
//			System.out.println(a + 10);
//		} else {
//			System.out.println("정상적인 값이 아님 null 임");
//		}
	}

}
