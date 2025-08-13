package chapter17;

import java.util.Arrays; // 배열 비교에 필요한 유틸리티 클래스

class INum1 {
	private int num; // 클래스 안에 숫자 하나 저장

	public INum1(int num) {
		this.num = num; // 생성자: 객체 만들 때 숫자 초기화
	}

	@Override
	public boolean equals(Object obj) {
		INum1 o = (INum1)obj;
		if(this.num == o.num) {
			return true;
		} 
		return false;
	}

	public class Ex15_ArrayObjEquals {

		public static void main(String[] args) {
			// INum1 객체를 저장할 배열 2개 만들기 (크기 2짜리 배열)
			INum1[] arr1 = new INum1[2];
			INum1[] arr2 = new INum1[2];

			// arr1의 첫 번째 칸에 숫자 1 가진 객체 넣기
			arr1[0] = new INum1(1);
			// arr2의 첫 번째 칸에도 숫자 1 가진 객체 넣기
			arr2[0] = new INum1(1);

			// arr1의 두 번째 칸에 숫자 2 가진 객체 넣기
			arr1[1] = new INum1(2);
			// arr2의 두 번째 칸에도 숫자 2 가진 객체 넣기
			arr2[1] = new INum1(2);

			System.out.println(Arrays.equals(arr1, arr2));
		}

	}
}