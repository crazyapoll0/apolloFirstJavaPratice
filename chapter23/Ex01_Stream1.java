package chapter23;
import java.util.*;
import java.util.stream.Stream;

public class Ex01_Stream1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Box", "Robot", "Simple");
		//1.스트림 객체 만들기
		Stream<String> st1 = list.stream();
		//2. 중간 연산 수행하기(생략 가능)
		Stream<Integer> st2 = st1.map((s) -> s.length());											
		//3. 최종 연산(필수)
		int total = list.stream()
				.map((s) -> s.length())
				.mapToInt(i -> i)
				.sum();
		System.out.println(total);
		
	}

}