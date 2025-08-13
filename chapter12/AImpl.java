package chapter12;

public class AImpl implements ABC{	//A, B 인터페이서의 구현체 

	@Override
	public void a() {
		System.out.println("인터페이스 A의 a() 메서드를 호출하였습니다.");		
	}	
	
	public void test() {
		System.out.println("클래스 A의 test() 메서드를 호출하였습니다.");
	}

	@Override
	public void b() {
		System.out.println("클래스 B의 test() 메서드를 호출하였습니다.");		
	}

	@Override
	public void c() {
		System.out.println("클래스 C의 test() 메서드를 호출하였습니다.");				
	}
}

