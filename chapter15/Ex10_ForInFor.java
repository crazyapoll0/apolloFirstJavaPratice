package chapter15;

public class Ex10_ForInFor {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int num = 1;	//1부터 채워 넣음
		
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
		
		//똑같이 출력하는 for-each문으로 작성
		for (int[] sub : arr) {
			for(int n : sub ) {
				System.out.println(n + "\t");
			}
			System.out.println();
		}
		
	}

}
