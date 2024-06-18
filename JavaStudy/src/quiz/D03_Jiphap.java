package quiz;

import java.util.HashSet;

public class D03_Jiphap {
	
	/*
		1. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		   
		2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		
		3. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
		   [1, 2, 3] - [2, 3, 4, 5] => [1]
		   [2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 */
	
	static HashSet<Integer> sum(HashSet<Integer> jiphap1, HashSet<Integer> jiphap2) {
		jiphap1.addAll(jiphap2);
		return jiphap1;
	}
	
	static HashSet<Integer> kyo(HashSet<Integer> jiphap1, HashSet<Integer> jiphap2) {
		jiphap1.retainAll(jiphap2);
		return jiphap1;
	}
	
	static HashSet<Integer> cha(HashSet<Integer> jiphap1, HashSet<Integer> jiphap2) {
		jiphap1.removeAll(jiphap2);
		return jiphap1;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> jiphap1 = new HashSet<>();
		HashSet<Integer> jiphap2 = new HashSet<>();
		
		jiphap1.add(1);
		jiphap1.add(2);
		jiphap1.add(3);
		
		jiphap2.add(2);
		jiphap2.add(3);
		jiphap2.add(4);
		jiphap2.add(5);
		
		System.out.println(sum(jiphap1, jiphap2));
	}
}
