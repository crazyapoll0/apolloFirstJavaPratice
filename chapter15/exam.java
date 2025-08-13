package chapter15;

import java.util.*;

public class exam {

	public static void main(String[] args) {

		String str = "apple banana apple orange banana apple orange";
		String[] arr = str.split(" ");
		Arrays.sort(arr);
		
		int count = 1;
		for(int i=1; i<arr.length; i++) {
			//i(현재)번째 요소랑 i-1(이전)번째 요소 비교
			//then count++
			//else "과일명 : count" 출력하고, count = 1 초기화
			if(arr[i].equals(arr[i-1])) {
				count++;
			}else {
				System.out.println(arr[i-1] + " : " + count);
				count = 1;
			}
		}
		//마지막 요소 : count
		System.out.println(arr[arr.length-1] + " : " + count);
	}	
}