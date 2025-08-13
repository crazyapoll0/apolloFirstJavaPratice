package ex0;
import java.util.Scanner;
public class Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("값을 차례대로 입력하시오.");	
	
	/* 출력 */
		System.out.println("a값을 입력하세요.");
			int a = sc.nextInt();

		System.out.println("b값을 입력하세요.");
			int b = sc.nextInt();

		System.out.println("c값을 입력하세요.");
			int c = sc.nextInt();
	
	for ( int x=0; x<10; x++) {	
		for( int y = 0; y <= 10; y++) {
			if ( a*x + b*y == c)  
				
		/* 해당 방정식을 만족하는 모든 해를 출력합니다. (x, y) */
				System.out.printf("(%d, %d)\n", x, y );
		}
	}
		/* 모든 해를 출력 후 종료합니다. */
				sc.close();
				 
		}
	}
