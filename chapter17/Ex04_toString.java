package chapter17;

class Book4 {
	String author;
	String title;
	String store;

	@Override
	public String toString() {
		return author;
	}
	
	/*Book3 타입은 저자(author)와 제목(title)이 같으면 같은걸로 본다.*/
	@Override
	public boolean equals(Object obj) {
		 Book4 other = (Book4)obj;
		 if (this.title.equals(other.title) && this.author.equals(other.author)) {
			 return true;
		 } 
		 return false;
	} 
}

public class Ex04_toString {
	public static void main(String[] args) {
		int a = 1;
		Integer b = 1;		//boxing
		Integer c = 2;		//unboxing 
		int d = b;
		System.out.println(a + b + c); 
		Integer e = Integer.parseInt("33");
		System.out.println(e);
//		Book4 myBook = new Book4();
//		Book4 myBook2 = new Book4();		
//		myBook.author = "홍길동";
//		myBook.title = "홍길동전";
//		myBook.store = "예스24";
//		
//		myBook2.author = "홍길동";
//		myBook2.title = "홍길동전2";
//		myBook2.store = "예스24";
//		
//		System.out.println(myBook.author);
//		if (myBook.equals(myBook2)) {
//			System.out.println("같은 책입니다.");
//		}else {
//			System.out.println("다른 책 입니다.");
//		}
	}
}
