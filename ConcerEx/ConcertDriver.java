import java.util.Scanner;

public class ConcertDriver {
	public static void main(String[] args) {
		Concert concert = new Concert("가수왕", 100, 10000, 20000);
		Scanner sc = new Scanner(System.in);
		char flag = 'S';
		System.out.println("콘서트 판매 프로그램을 시작합니다");

		while (true) {
			if (conert.getValidOnline()) {
				System.out.print("\n인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
			} else {
				System.out.print("\n현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");
			}
			flag = sc.nextLine().charAt(0); 		//문자열 중에 제일처음 문자만 불러옴
			if (flag == 'S') {
				System.out.print("파는 티켓들 수는? <최대" + conert.getRest() + "> ");
				int purchases = Integer.parseInt(sc.nextLine());
				conert.validateAndSale(purchases);
				System.out.println("남은 티켓들의 수: " + con.getRest());
			} else if (con.getValidOnline() && flag == 'V') {
				con.setValidOnline(false);
			} else if (flag == 'F') {
				System.out.println("남은 티켓들의 수: " + con.getRest());
				break;
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		}

		con.finalReport();
		System.out.print("계속하려면 아무 키나 누르십시오 . . .");
		sc.nextLine();
		sc.close();
	}		
}																										