package chapter21;

import java.util.LinkedList;
import java.util.Queue;

public class CardSelect {

	public static void main(String[] args) {
		int N = 6;
		Queue<Integer> que = new LinkedList<>();
		/*
		 * 1. queue에 1~N까지 숫자를 집어넣는다. ::offer 
		 * 2. 카드가 한장이 남을때까지 반복(while) 
		 * 3. 맨 앞의 카드를 한 장 뽑아 버리고, ::poll 
		 * 그 다음 맨 앞의 카드를 맨 뒤로 옮기는 동작 ::poll, offer 
		 * 4. 출력
		 */
			// 1. que 1 2 3 4 5 6
			for (int i=1; i <= N; i++) {
				que.offer(i);
			} 
			
			//3번
			while (que.size() != 1) {
				// 3. 맨앞 뿁기
				que.poll();
				// 맨 앞걸 뒤로 			
				que.offer(que.poll());
				
			}				
			System.out.println("마지막 카드는 : " + que.peek());
		} 
	
	}

// 1 2 3 4 5 6 
// 2 3 4 5 6
// 3 4 5 6 2

// 4 5 6 2 
// 5 6 2 4

// 6 2 4 
// 2 4  

// 2 4 
// 4
 

