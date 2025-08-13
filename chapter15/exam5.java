package chapter15;

import java.util.Arrays;

public class exam5 {

	public static void main(String[] args) {
		int[] origin = {1,2,3,4,5};
		int[] copied = origin;
		
		copied[0] = 10;
		System.out.println("===origin===");
		for(int o : origin) System.out.println(o + "\t");
		System.out.println();
		System.out.println("===copied(얕은 복사)===");
		for(int c : origin ) System.out.print(c + "\t");		
		
		int[] copied2 = Arrays.copyOf(origin, origin.length);
		copied2[0] = 100;
		
		System.out.println();
		System.out.println("===origin===");
		for(int o : origin) System.out.println(o + "\t");
		System.out.println();
		System.out.println("===copied2(깊은 복사)===");
		for(int c : copied2)System.out.print(c + "\t");
	}
}
