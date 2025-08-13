package chapter21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) { 
		// 문자열을 여러 개 담을 수 있는 상자를 만든다 (List라는 상자)
		List<String> list = new ArrayList<>();
		
		//객체 저장 : 순서 있음. 중복 허용
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		Collections.sort(list);
		// 상자에 뭐가 들어있는지 하나씩 꺼내서 보여준다
//		for(int i=0; i<list.size(); i++)
//			System.out.println(list.get(i) + '\t');
//		for(String str : list) { 
//			System.out.println(str + '\t'); 
//		}  	
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + '\t');
		}
		
		System.out.println(); 
		
		// 첫 번째 객체 삭제
		list.remove(0); 	// 오렌지를 없앤다
		
		// 삭제 후 객체 참조 
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');			// 남아있는 과일들을 보여준다
		System.out.println();
				
	}

}
