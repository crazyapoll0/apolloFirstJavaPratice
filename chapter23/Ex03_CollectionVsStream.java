package chapter23;
import java.util.*;
import java.util.Collections;

public class Ex03_CollectionVsStream {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 2, 4};
		List<Integer> List = new ArrayList<>();
		
		//컬렉션 프레임워크를 이용한 방식 
		for(int i : arr) 
		{
			if (i%2 == 1) {
				List.add(i);
			}
		}

		Collections.sort(List); //정렬
		
		for(int i : List) 		//요소 추출
		{
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		//Stream을 이용한 방식
		Arrays.stream(arr) 
		.filter(n -> n%2 == 1) //필터링
		.sorted()				//정렬
		.forEach(n -> System.out.print(n + "\t"));	//요소 추출 
		
		System.out.println();
	}

}
