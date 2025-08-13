//package chapter12;
//
//class Unit {				//부모클래스
//	String name;
//	int hp;
//
//	void printUnit() {
//		System.out.println("이름 :" + name);
//		System.out.println("HP :" + hp);
//	}
//}
//
//class Marine extends Unit {			//자식클래스 : 마린
//	int attack;
//
//	void printMarine() 
//	{
//		printUnit();
//		System.out.println("공격력 :" + attack);
//	}
//}
//
//class Medic extends Unit {			//자식클래스 : 메딕
//	int heal;
//
//	void printMedic() {
//		printUnit();
//		System.out.println("치유량 :" + heal);
//	}
//}
//
//
////main 인스턴스
//public class MyTerran {
//
//	public static void main(String[] args) 
//	{
//		Marine unit1 = new Marine();			//객체 생성 : 마린
//		unit1.name = "마린";
//		unit1.hp = 100;
//		unit1.attack = 20;
//
//		Medic unit2 = new Medic();				//객체 생성 : 메딕
//		unit2.name = "메딕";
//		unit2.hp = 120;
//		unit2.heal = 10;
//
//		unit1.printMarine();
//		System.out.println();
//		unit2.printMedic();
//		
//		killUnit(unit1);
//		killUnit(unit2);
//	}
//
//
//	static void killUnit(Unit u) {
//	u.hp = 0;	
//	u.printUnit();	
//	
//	}
//}

package chapter12;

abstract class Unit 		
//인스턴스를 만들수 없음.
//반드시 이 클래스를 상속해서 자식 클래스를 사용해야 한다.
{
	String name;			
	int hp;
	//유닛을 상속할 클래스들이 공통으로 갖는 속성.
	//유닛을 상속하는 클래스는 반드시 doMove라는 메서드를 갖는다.
	//추상 메서드의 구현은 자식 클래스의 몫임
	//추상 클래스는 추상 메서드를 가질수도 있고 없을 수도 있다.
	
	//초딩설명
	// 이 클래스는 '유닛'이라는 기본 틀(설계도)야
	// 이걸 물려받는 애들은 공통으로 이름, 체력 같은 걸 갖고 있어
	// 그리고 반드시 'doMove()'라는 행동을 만들어야 해 (약속이야!)
	// 'doMove()'는 여기선 어떻게 하는지 안 적어놨어 (빈칸)
	// 나중에 자식 클래스가 직접 "어떻게 움직이는지" 정해야 해!
	// 참고로! 추상 클래스는 꼭 빈칸(추상 메서드)이 없어도 만들 수 있어!

	
	abstract void doMove();			
}
//		System.out.println("이동속도 10으로 이동");

class Marine extends Unit 		
{
	int attack;
	
	void doMove()			
	{
//		super.doMove();
		System.out.println(attack + "공격");
	}
}

class Medic extends Unit 
{
	int heal;
	
	@Override
	void doMove() 
	{
		System.out.println("이동속도 8으로 이동");
		System.out.println(heal + "치유");
	}
}


public class MyTerran {

	public static void main(String[] args) 
	{
		Marine unit1 = new Marine();			//객체 생성 : 마린
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;
		
		Medic unit2 = new Medic();				//객체 생성 : 메딕
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;
		
		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}

}









