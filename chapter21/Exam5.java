package chapter21;

import java.util.TreeSet;

public class Exam5 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 4, 7, 3, 5, 5, 4, 3, 1, 6 };
		/* 자유롭게 변수 추가 및 코드 작성 */
		TreeSet<Integer> tree = new TreeSet<>(); 
		
		for(int str : nums)
			tree.add(str);			
		System.out.println(tree);
	}
}