package chapter21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam3 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
	    Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
	    Set<Integer> result = new HashSet<>();
	    /* 반복문과 조건문을 사용하여 교집합을 구하세요 */
	    //set1의 주소값 0,1,2와 set2의 주소값 0,1,2를 전부 구분하는 조건식 -> 총9번비교 될거임 (for문사용)
	    //set1의 주소값과 == set2의 주소값 이 일치하다면 출력 (교집합)
	    
	    for (Integer i : set2) {
	    	if ( set1.contains(i)) {
	    	result.add(i);
	    	}
	    }
	    
	    System.out.println(result);

	}

}
