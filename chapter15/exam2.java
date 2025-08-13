package chapter15;

import java.util.*;

public class exam2 {

	private static String output;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.");
		String input = sc.nextLine();
		
		/*
		입력받은 문자열을 거꾸로 뒤집어 변수[output]에 담아
		출력하는 프로그램을 작성하라
		단, StringBuilder의 reverse()메서드는 사용하지 않는다.
		예시)
		입력 : abcde
		출력 : edcba
		*/
		
//		for (i = input.length() - 1; i >= 0; i--) {
//			System.out.print(input.charAt(i));

		//case3.
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sb.reverse();
		output = sb.toString();
		
			sc.close();
			
		}

	}
