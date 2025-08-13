package chapter16;

public class Ex06_ExceptionThrow {
	public static void myMethod1(int n) {
		try {
			myMethod2(n, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch {
			
		}
	}

	public static void myMethod2(int n1, int n2) 
			throws 	ArithmeticException, 
					ClassNotFoundException, 
					IllegalArgumentException 
	{
		int r = n1 / n2; 										// 예외 발생 지점
		try {
			Class.forName("ABCDE");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		myMethod1(3);
		System.out.println("Exception Throw!!!");

	}

}
