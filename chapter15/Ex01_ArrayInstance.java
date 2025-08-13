package chapter15;

import javax.swing.Box;

public class Ex01_ArrayInstance {
	
	public static void main(String[] args) {
		
	}
	int[] ar1 = new int[5];
	double[] ar2 = new double[7];
	
	float[] ar3;
	ar3 =  new float[9];
	
	Box[] ar4 = new BoxA1[5];
	
	System.out.println("배열 ar1 길이: " + ar1.lenght);
	System.out.println("배열 ar2 길이: " + ar2.lenght);
	System.out.println("배열 ar3 길이: " + ar3.lenght);
	System.out.println("배열 ar4 길이: " + ar4.lenght);
	}
}