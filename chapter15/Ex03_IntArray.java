package chapter15;

public class Ex03_IntArray {

	public static void main(String[] args) {
		
		//길이가 3인 int형 1차원 배열의 생성
		int[] ar = new int[3];
//		LinkedList<integer> list = new Linkedlist() {};
		
		ar[0] = 100;
		ar[1] = 90;
		ar[2] = 80;
		
		int sum = ar[0] + ar[1] + ar[2];  		//값의 참조
		System.out.println("총점 : " + sum);
	}

}
