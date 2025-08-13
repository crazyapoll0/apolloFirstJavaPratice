package ex0;

public class Book {
	
	String title;
	String writer;
	String ISBN;
	boolean isPublished;
	
	/* 객체 초기화 부분 */
	Book(String title, String writer, String ISBN, boolean isPublished) {		
		this.title = title; 
		this.writer = writer; 
		this.ISBN = ISBN;
		this.isPublished = isPublished;
	}  			
	
	public void publish() {		
		this.isPublished = true;	 
	}							
	
	@Override //오버라이딩 올라타다 = 다시 정의한다.
	public String toString() {
		return "책 이름 :\t" + this.title     // \t의 의미는 탭을 의미
				+ "\n저자: \t" + this.writer			
				+ "\nISBN :\t" + this.ISBN;		
		 		
	}		
	
}
