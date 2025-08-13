package chapter21;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class Exam2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, -2, 5, -1);
		int sum = 0;
		int max = nums.get(0);

		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
			if (sum >= max) {
				max = sum;
			}
			if (sum < 0)
				sum = 0;
		}
		System.out.println(max);
	}
}