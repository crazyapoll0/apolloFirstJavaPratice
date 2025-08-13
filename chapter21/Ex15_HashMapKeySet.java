package chapter21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex15_HashMapKeySet {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//key-Value기반 데이터 저장
		map.put("홍길동", 20);
		map.put("전우치", 25);
		map.put("손오공", 27);
		
		//key만 담고 있는 컬렉션 객체 생성
		Set<String> ks = map.keySet();
//		Set<Map.Entry<String, Integer>> es = map.entrySet();
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		
		for(String s: ks)
			System.out.print(s + '\t');
		System.out.println();
		
		for(String s : ks) 
			System.out.print(map.get(s).toString() + '\t');
		System.out.println();
		
		for(Iterator<String> itr = ks.iterator(); itr.hasNext(); )
			System.out.print(map.get(itr.next().toString() + '\t'));
			System.out.println();			
		
	}

}
