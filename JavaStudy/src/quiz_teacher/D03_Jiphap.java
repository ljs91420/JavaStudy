package quiz_teacher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {

	public static Set union(Collection a, Collection b) {
		// 전달된 원본을 훼손시키는 방법
//		a.addAll(b);
//		Set union = new HashSet(a);
		
		Set union = new HashSet();
		
		union.addAll(a);
		union.addAll(b);
		
		return union;
	}
	
	public static Set inter(Collection a, Collection b) {
//		a.retainAll(b);
//		Set inter = new HashSet(a);
		
		Set inter = new HashSet();
		
		inter.addAll(a);
		inter.retainAll(b);
		
		return inter;
	}
	
	public static Set diff(Collection a, Collection b) {
//		a.removeAll(b);
//		Set diff = new HashSet(a);
		
		Set diff = new HashSet();
		
		diff.addAll(a);
		diff.removeAll(b);
		
		return diff;
	}
	
	public static void main(String[] args) {
		List<String> snack1 = new ArrayList<>();
		Set<String> snack2 = new HashSet<>();
		
		snack1.add("초코파이");
		snack1.add("웨하스");
		snack1.add("쿠크다스");
		
		snack2.add("쿠크다스");
		snack2.add("오예스");
		snack2.add("포스틱");
		
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();
		
		num1.add(1);
		num1.add(2);
		num1.add(3);
		
		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);
		
		System.out.println(num1 + " VS " + num2); // [1, 2, 3] VS [2, 3, 4, 5]
		System.out.println(snack1 + " VS " + snack2); // [초코파이, 웨하스, 쿠크다스] VS [오예스, 포스틱, 쿠크다스]
		
		Set unionResult = union(num1, num2);
		Set unionResult2 = union(snack1, snack2);
		
		System.out.println("### 합집합 ###"); // ### 합집합 ###
		System.out.println(unionResult); // [1, 2, 3, 4, 5]
		System.out.println(unionResult2); // [오예스, 웨하스, 포스틱, 초코파이, 쿠크다스]
		
		Set interResult = inter(num1, num2);
		Set interResult2 = inter(snack1, snack2);
		
		System.out.println("### 교집합 ###"); // ### 교집합 ###
		System.out.println(interResult); // [2, 3]
		System.out.println(interResult2); // 쿠크다스
		
		Set diffResult = diff(num1, num2);
		Set diffResult2 = diff(snack1, snack2);
		
		System.out.println("### 차집합 ###"); // ### 차집합 ###
		System.out.println(diffResult); // [1]
		System.out.println(diffResult2); // [웨하스, 초코파이]
	}
}
