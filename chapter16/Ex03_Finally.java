package chapter16;
import java.util.*;
import java.util.InputMismatchException;
public class Ex03_Finally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try { 
			int num1 = sc.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);
			}
		catch (ArithmeticException | InputMismatchException e) {
		    System.out.println("예외 발생");
		}

//		String str = e.getMessage();
//		System.out.println(str);
//		if(str.equals("/by zero"))
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		catch(InputMismatchException e) { 
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}
		
			System.out.println("Good bye~~!");
		}
	}

