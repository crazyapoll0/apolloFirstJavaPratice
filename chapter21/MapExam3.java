package chapter21;

import java.util.*;

public class MapExam3 {

	public static void main(String[] args) {
		String str = "hi, my name is donghee. nice to meet you";
		Map<Character, Integer> map = new HashMap<>();
		int maxValue = 0;
		char maxKey = '0';
		/* 자유롭게 변수 추가 및 코드 작성 */

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());

			if (e.getValue() != ' ' && e.getKey() > maxValue) {
				maxValue = e.getValue();
				maxKey = e.getKey(); 
			}
		}
			System.out.println("가장 많이 등장한 수 : " + maxKey);
	}
}