package chapter18;

enum HumanState {
	STAND("일어남", "stand"),
	SIT("앉음", "sit"), 
	RUN("달림", "run"), 
	SLEEP("잠", "sleep");
	
	HumanState(String name, String type) {
		this.name = name;
		this.type = type;
	} 
	
	private final String name; 
	private final String type;
	
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}	
}

//interface HumanState {
//	int STAND = 1;
//	int SIT = 2;
//	int RUN = 3;
//	int SLEEP = 4; 
//}	

class Human {
	String name;
	HumanState state;

	Human(String name, HumanState state) {
		this.name = name;
		this.state = state;
	}
}

public class EnumExam {

	public static void main(String[] args) {
		Human human1 = new Human("철수", HumanState.RUN);
		Human human2 = new Human("영희", HumanState.STAND);
		howAreYou(human1);
		howAreYou(human2);
	}

	static void howAreYou(Human human) {
		System.out.println(human.name + "의 상태는 " + human.state.getType() + "입니다.");
		
		// 들어온 사람의 상태를 확인해서 적잘한 상태를 출력
//		if (human.state == HumanState.STAND) {
//			System.out.println(human.name + "은(는) 일어서있다.");
//		} else if (human.state == HumanState.SIT) {
//			System.out.println(human.name + "은(는) 앉아있다.");
//		} else if (human.state == HumanState.RUN) {
//			System.out.println(human.name + "은(는) 달리고있다.");
//		} else if(human.state == HumanState.SLEEP) {
//			System.out.println(human.name + "은(는) 일어서있다.");
//		}
	}
}
