package chapter21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		/*
		 * [문제] 정수 N개가 주어졌을 떄, ArrayList에 저장한 뒤 짝수만 골라서 오름차순으로 출력하는 프로그램을 작성하세요.
		 * 1.numbers라는 이름의 ArrayList 생성 2.[5, 3, 8, 2, 7, 6] 순서로 값 추가 3.evenNumbers라는
		 * 이름이 다른 ArrayList 생성 4.numbers의 값 중 짝수만 골라서 evenNumbers에 추가 5.evenNumbers
		 * 정렬(sort) 6.evenNumbers 값 전체 출력
		 */

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(2);
		numbers.add(7);
		numbers.add(6);

		ArrayList<Integer> evennumbers = new ArrayList<>();
		for (Integer n : numbers) {
			if (n % 2 == 0) {
					evennumbers.add(n);
			}
			
		}
		Collections.sort(evennumbers);
//		evennumbers.remove(Integer.valueOf(8));
		evennumbers.remove(numbers.add(3));

		for (int e : evennumbers)
			System.out.println(e);
	}
}


