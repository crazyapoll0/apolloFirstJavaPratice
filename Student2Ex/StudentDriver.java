package Student2Ex;
import java.util.*;
public class StudentDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student1 = new Student("선남");
		Student student2 = new Student("선녀");
		
		//선남
		System.out.println(student1. getName() + "의 퀴즈 점수를 입력하라:");
		student1.setQuizScore(sc.nextInt());
		//case 1.
		//setQuizScore() 메서드가 정상적으로 수행됐을 때 => true
		//비정상적인 값을 받았을 때 => false
			while(true){
				System.out.println(student1.getName() + "의 퀴즈 점수를 입력하라:");
				if((boolean) student1.setQuizScore(sc.nextInt())) {
					break;
		 	}
		System.out.println(student1. getName() + "의 중간시험 점수를 입력하라:");
		student1.setMiddleScore(sc.nextInt());
		
		System.out.println(student1. getName() + "의 기말시험 점수를 입력하라:");
		student1.setFinalScore(sc.nextInt()); 
		
		System.out.println(student1.getName() + "의 총점은" + student1.getTotalScore() + "이고 학점은" + student1.getGrade() +"의 시험 점수를 입력하라:");
		
		//선녀 
		System.out.println(student2. getName() + "의 퀴즈 점수를 입력하라:");
		student2.setQuizScore(sc.nextInt());
		
		System.out.println(student2. getName() + "의 중간시험 점수를 입력하라:");
		student2.setMiddleScore(sc.nextInt());
		
		System.out.println(student2. getName() + "의 기말시험 점수를 입력하라:");
		student1.setFinalScore(sc.nextInt());
		
		System.out.println(student2.getName() + "의 총점은" + student2.getTotalScore() + "이고 학점은" + student2.getGrade() +"의 시험 점수를 입력하라:");
		sc.close();
			}	 

	}   
}   

             