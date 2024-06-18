
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
		// TODO Auto-generated method stub
		
		int a = 15, b = 7;
		double c = 7.0;
		
		int result1 = a + b;
		double result2 = a + c;
		int result3 = (int)(a + c);
		
		System.out.printf("a + b = %d\n", a + b);
		System.out.printf("a - b = %d\n", a - b);
		System.out.printf("a * b = %d\n", a * b);
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a + c = " + (a + c));
		System.out.println("a - b = " + (a - b));
		System.out.println("a - c = " + (a - c));
		System.out.println("a * b = " + a * b);
		System.out.println("a * c = " + a * c);
		System.out.println("a / b = " + a / b);
		System.out.println("a / c = " + a / c);
		System.out.println("a % b = " + a % b);
		System.out.println("a % c = " + a % c);
		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.round(1.55));
		System.out.println(Math.ceil(1.11));
		System.out.println(Math.floor(1.99));
		
		System.out.println(Math.floor(10.34567 * 100) / 100);
		
		// 제곱
		System.out.println(Math.pow(2, 10));
		
		// 제곱근
		System.out.println(Math.sqrt(48));
	}

}
