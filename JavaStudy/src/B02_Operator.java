
public class B02_Operator {

	/*
		# 연산자(Operator)
		
			- 계산할 때 함께 사용하는 것
			- +, -, *, /, >, <, >=, ...
			
		# 산술 연산자
		
			+ : 더하기
			- : 빼기
			* : 곱하기
			/ : 나누기(정수로 나눌 때와 실수로 나눌 때의 결과가 다름)
			% : 나머지
	 */
	
	public static void main(String[] args) {
		int a = 15, b = 7;
		double c = 7.0;
		
		int result1 = a + b;
		double result2 = a + c;
		int result3 = (int)(a + c);
		
		System.out.printf("a + b = %d\n", a + b); // a + b = 22
		System.out.printf("a - b = %d\n", a - b); // a - b = 8
		System.out.printf("a * b = %d\n", a * b); // a * b = 105
		
		System.out.println("a + b = " + (a + b)); // a + b = 22
		System.out.println("a + c = " + (a + c)); // a + c = 22.0
		System.out.println("a - b = " + (a - b)); // a - b = 8
		System.out.println("a - c = " + (a - c)); // a - c = 8.0
		System.out.println("a * b = " + a * b); // a * b = 105
		System.out.println("a * c = " + a * c); // a * c = 105.0
		System.out.println("a / b = " + a / b); // a / b = 2
		System.out.println("a / c = " + a / c); // a / c = 2.142857142857143
		System.out.println("a % b = " + a % b); // a % b = 1
		System.out.println("a % c = " + a % c); // a % b = 1.0
		
		System.out.println(Math.abs(10)); // 10
		System.out.println(Math.abs(-10)); // 10
		
		System.out.println(Math.round(1.55)); // 2
		System.out.println(Math.ceil(1.11)); // 2.0
		System.out.println(Math.floor(1.99)); // 1.0
		
		System.out.println(Math.floor(10.34567 * 100) / 100); // 10.34
		
		// 제곱
		System.out.println(Math.pow(2, 10)); // 1024.0
		
		// 제곱근
		System.out.println(Math.sqrt(48)); // 6.928203230275509
	}

}
