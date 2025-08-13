package chapter23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex05_Map {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "orange");
		//List<String> -> String[]
		//case1
		String[] strArr = list.stream().toArray(String[]::new);
		//case2
		String[] str = new String[list.size()];
		for(int i=0; i<str.length; i++) {
			str[i] = list.get(i);
		}
		
		//String[] -> list<String>
		List<String> strList = Arrays.stream(strArr).collect(Collectors.toList());
		//int[] -> List<Integer>
		int[] intArr = {1, 2, 3, 4, 5};
		List<String> intList = Arrays.stream(strArr).collect(Collectors.toList()); 
		
		//int[] -> List<Integer>
		int[] intArr1 = {1, 2, 3, 4, 5};
		List<Integer> intList1 = Arrays.stream(intArr1).boxed().collect(Collectors.toList());
		
		//list<Integer> -> int[]
		int[] intArr2 = intList1.stream().mapToInt(Integer::intValue).toArray();
		
//		list.stream()
//			.map(s -> s.toUpperCase())
//			.forEach(n -> System.out.print(n + "\t"));
		
			System.out.println();
	}

}
