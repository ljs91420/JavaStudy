package quiz;

import java.util.ArrayList;

public class D01_ArrayListQuiz {

	/*
		1. 리스트에 1000 ~ 1999 사이의 랜덤 정수를 100개 추가하기
		
		2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
		
		3. 2번의 결과에서 홀수를 모두 제거한 후 남아있는 값의 개수를 세기
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int value;
		
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1000) + 1000);
		}
		
		for (int i = 0; i < list.size(); ++i) {
			value = Integer.valueOf(i);
			if (value % 2 == 0) {
				list.remove(value);
			}
		}
		System.out.println(list);
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); ++i) {
			value = Integer.valueOf(i);
			if (value % 2 != 0) {
				list.remove(value);
			}
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}
