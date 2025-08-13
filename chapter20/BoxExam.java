package chapter20;
class Box<T> {
	T value;
	String nameTag;
	
	Box(T value, String nameTag) {
		this.value= value;
		this.nameTag = nameTag;
	}

	public T getValue() {
		return value; 	 	 	 	 	 	 
	}
	
}

public class BoxExam {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>(10, "숫자상자1");
		Box<Double> box3 = new Box<Integer>(10.23, "숫자상자2");
		Box<Long> box2 = new Box<Integer>(10L, "숫자상자3");
//		Box<String> box2 = new Box<String>("hello", "문자상자1");
		
		doSomething(box1);
//		doSomething(box2);
		doSomething(box3);
		System.out.println(add(10, 12.3));
		
		//숫자 꺼내기
		Integer val1 = (Integer)box1.getValue();
		static void doSomething(Box<?> extends Number> box) { 
			
		}
		//문자 꺼내기 
//		String val2 = box2.getValue();
//		System.out.println("문자상자의 값 :" + val2);
	} 
	static <T extends Number> double add(T o1, T o2) {
		return o1.doubleValue() + o2.doubleValue();
 	}

}
