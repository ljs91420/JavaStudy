
public class B03_Operator2 {

	/*
		# 비교 연산자
		
			- 산술 연산과 비교 연산이 같이 있으면 산술 연산을 먼저 진행한다.
			
		# 논리 연산자
		
			- 두 boolean 값으로 연산하는 연산자
			- &&, ||, !
	 */
	
	public static void main(String[] args) {
		int a = 10, b = 15;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		
		System.out.println(a + b > a * b); // false
		
		
	}

}
