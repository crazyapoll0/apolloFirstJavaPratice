package Student2Ex;

public class Student {
	private String name;
	private int quizScore;
	private int middleScore;
	private int finalScore;
	
	Student(String name) { 			//같은 패키지 안이라 public안 붙여도됨.
		this.name = name;			
	}
	
	public double getTotalScore() {
		// 총점 구해서 반환
		int total = this.quizScore + this.middleScore + this.finalScore; 
		double avg = Math.round(total/3.0*10)/10.0; 			// 소수점 첫째자리까지 표현
		return avg;		
	} 							
	
	public char getGrade() {
		// 학점 구해서 반환 
		int level = (int) (this.getTotalScore()/10);
		switch(level) {	
			case 10:
			case 9: return 'A';
			case 8: return 'B';
			case 7: return 'C';
			case 6: return 'D';
			default: return 'F';  
		}					
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuizScore() {
		return quizScore;
	}

	public boolean setQuizScore(int quizScore) {
		if(quizScore < 0 || quizScore > 100)
			return false;
		
		this.quizScore = quizScore;
			return true;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public boolean setFinalScore(int finalScore) {
		if(finalScore < 0 || finalScore > 100)
			return false;
		this.finalScore = finalScore;
		return true;
	}
	
	
}
