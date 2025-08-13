package chapter21;
import java.util.*;
public class MapExam {

	public static void main(String[] args) {
		int[] nums =  {1,1,4,7,3,5,5,4,3,1,6};
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {
			if (map.get(n) != null) {
				map.put(n, map.get(n) + 1);
			} else { 				// 그 key값 (=n)이 map에 존재하지 않다.
				map.put(n, 1); 
			} 
			
			Set<Integer> ks = map.keySet();
			for(Integer key : ks) {
				System.out.println(key + ":" + map.get(key));
			}
		}
	} 
}


// 1. 지금 n이 map에 key가 존재하면 기존의 해당 key의 value에 +1한 값으로 갱신.
			// 현재 해당 key의 value는 map.get(n)
			// int origin = map.get(n);
			// 갱신 ?? => map.put(key, value)
			// ==> 앞에서 한번도 나온적 없다.
			// =>map.put(n, 1);
			//map.entryset();

	/*for(int n : nums) {
	int i = map.getOrDefault(n,0);			// 숫자 n이 이미 있는지 확인. 없으면 기본값 0
	map.put(n, i+1); 						// 현재 값에 1 더해서 다시 저장
	} */