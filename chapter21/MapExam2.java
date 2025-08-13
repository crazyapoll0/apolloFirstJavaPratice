package chapter21;

import java.util.*;

public class MapExam2 {

	public static void main(String[] args) {
		int maxValue = Integer.MIN_VALUE;
		int maxKey = Integer.MIN_VALUE;

		// 이거 각 숫자가 몇번 나오는지
		// 각 숫자마다 개수를 세어달라
		/*
		 * 1 : 3 3 : 2 4 : 2 . . .
		 */
		int[] nums = { 1, 1, 4, 7, 3, 5, 5, 4, 3, 1, 6 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : nums)
			map.put(n, map.getOrDefault(n, 0) + 1);

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());

			if (e.getValue() > maxValue) {
				maxValue = e.getValue();
				maxKey = e.getKey();  
			}
		}
		System.out.println("가장 많이 등장한 수 : " + maxKey);
	}
}