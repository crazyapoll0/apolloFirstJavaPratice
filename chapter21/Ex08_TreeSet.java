package chapter21;

import java.util.TreeSet;

public class Ex08_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<>();
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("손오공"); // 손오공 다시 추가하려 하지만, 중복은 저장 안 됨!
		
		System.out.println("객체 수: " + tree.size());
		
        // 상자 안에 들어 있는 이름들을 하나씩 꺼내서 보여준다
		for(String str : tree)
			System.out.println(str + '\t');
		System.out.println();
	}

}
