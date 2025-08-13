package chapter21;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
    	String s = "hello";
    	Stack<Character> stack = new Stack<>();
    	/* 자유롭게 변수 추가 및 코드 작성 */
    	//case1 map함수 사용
//    	for (int i=0; i<stack.size(); i++) {
//    		stack.push(s.charAt(i));
//    	} 
//    	
//    	while (!stack.isEmpty()) {
//    		System.out.print(stack.pop()); 		
//    	}
    	
    	//case2 StringBuilder사용
    	String original = "Hello";
    	String reversed = new StringBuilder(original).reverse().toString();
    	System.out.println(reversed); // 출력: olleH

	} 

}
