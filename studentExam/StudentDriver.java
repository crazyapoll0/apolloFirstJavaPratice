package studentExam;

import java.util.*;

public class StudentDriver {

	public static void main(String[] args) {

		Student Student1 = new Student("선남");
		Student Student2 = new Student("선녀");

//선남 결과출력
		Scanner sc = new Scanner(System.in);		

		System.out.printf(Student1.getName() + "의 퀴즈 점수를 입력하라.");
		int quizScore = sc.nextInt();
		Student1.setQuizScore(quizScore);

		System.out.printf(Student1.getName() + "의 중간 점수를 입력하라.");
		int middleScore = sc.nextInt();
		Student1.setMiddleScore(middleScore);

		System.out.printf(Student1.getName() + "의 기말 점수를 입력하라.");
		int finalScore = sc.nextInt();
		Student1.setFinalScore(finalScore);

		System.out.print(Student1);
		System.out.println(Student1.getName() + "의 총점은" + Student1.sum() + "이고 학점은"+ Student1.calculateGrade(Student1.sum()) + "이다.");

//선녀 결과출력			
		System.out.printf(Student2.getName() + "의 퀴즈 점수를 입력하라.");
		int quizScore1 = sc.nextInt();
		Student2.setQuizScore(quizScore1);

		System.out.printf(Student2.getName() + "의 중간 점수를 입력하라.");
		int middleScore1 = sc.nextInt();
		Student2.setMiddleScore(middleScore1);

		System.out.printf(Student2.getName() + "의 기말 점수를 입력하라.");
		int finalScore1 = sc.nextInt();
		Student2.setFinalScore(finalScore1);
		
		System.out.print(Student2);
		System.out.printf(Student2.getName() + "의 총점은" + Student2.sum() + "이고 학점은"+ Student2.calculateGrade(Student2.sum()) + "이다.");
		
		sc.close();
	}

}
