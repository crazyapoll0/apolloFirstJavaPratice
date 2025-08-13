package chapter15;

public class Ex11_PartiallyFilled {

	public static void main(String[] args) {
		int[][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
//		int[][] arr2 = arr; 	얕은 복사
		
		//깊은 복사
		int[][] copyArr = new int[origin.length][];
        /*
        {
        {},
        {},
        {},
        }
        */
        for(int i=0; i<origin.length; i++) {
        	copyArr[i] = new int[origin[i].length];
        	for(int j=0; j<copyArr[i].length; j++) {
        		copyArr[i][j] = origin[i][j];
        	}
        }
		
//		arr2[0][0] = 100;
		
		//배열의 구조대로 내용 출력
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + j++);
//			}
		for(int[] sub : arr ) {
			for(int num : sub) 
			{
				System.out.print(num + "\t");
			}	
			System.out.println();
		}

	}

}
