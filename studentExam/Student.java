package studentExam;

public class Student {		// field 선언
	private String name;
	private int quizScore;
	private int middleScore;
	private int finalScore;
	
	public Student() {} 		// 생성자
	
	public Student(String name) { 	// 이름 생성
		this.name = name;
	}	
	
	// getter 
	public String getName() { return name; }
	public int getQuizScore() { return quizScore; }
	public int getMiddleScore() { return middleScore; }
	public int getFinalScore() { return finalScore; }
	
	public int sum() {
		return (int)(quizScore*0.2 + middleScore*0.3 + finalScore*0.5 ); 	
	} 
	
	// setter
	public void setName(String name) { this.name = name; }
	
	// 0보다 작거나 100보다 크다면 적절한 경고 메시지를 출력
	public void setQuizScore(int quizScore) { 
		if (quizScore < 0 || quizScore > 100 ) {
			System.out.println("유효하지 않은 점수 입니다."); 
		} else { 
			 this.quizScore = quizScore;		
			}
		}
	
	public void setMiddleScore(int middleScore) { 
		if ( middleScore < 0 || middleScore > 100 ) {
			System.out.println("유효하지 않은 점수 입니다."); 
		} else {
			this.middleScore = middleScore; 
		}
	}
	
	public void setFinalScore(int finalScore) { 
		if ( finalScore < 0 || finalScore > 100) {
			System.out.println("유효하지 않은 점수 입니다."); 
		} else {
			this.finalScore = finalScore;
		} 
	}
	
	//등급
	public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
	
	@Override				// 오버라이드
	public String toString() {
		return "Student [name=" + name + ", quizScore=" + quizScore + ", middleScore=" + middleScore + ", finalScore="
				+ finalScore +"]";
		
	}			
}





