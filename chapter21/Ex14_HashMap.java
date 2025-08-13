package chapter21;

import java.util.HashMap;

public class Ex14_HashMap {

	public static void main(String[] args) {
		HashMap<String, String>map = new HashMap<>();
		
		//key-Value 기반 데이터 저장
		map.put("홍길동", "010-1234-1443");
		map.put("홍길동", "010-1234-1443");
		map.put("홍길동", "010-1234-1443");
		
		//데이터 탐색
		System.out.println("홍길동 :" + map.get("홍길동"));
		System.out.println("홍길동 :" + map.get("홍길동"));
		System.out.println("홍길동 :" + map.get("홍길동"));
		System.out.println();
		
		//데이터 삭제
		map.remove("손오공");
		
		System.out.println("손오공:" + map.get("손오공"));
	}

}
