
public class A03_VariableTypes {

	/*
	
		# 정수 타입
		
			- byte	(1byte, 8bit)
			  
			  2^8(256)가지의 값을 표현할 수 있다.
			  byte 타입 변수에 넣을 수 있는 정수의 범위는 -128 ~ +127(256가지)
			  
			- short	(2byte, 16bit)
			
			  2^16(65,536)가지의 값을 표현할 수 있다.
			  short 타입 변수에 넣을 수 있는 정수의 범위는 -32,768 ~ +32,767(65,536가지)
			
			- char	(unsigned 2byte)
			
			  2^16(65536)가지의 값을 표현할 수 있으나 부호가 없다(양수만 표현한다)
			  char 타입 변수에 넣을 수 있는 정수의 범위는 0 ~ 65535(65536가지)
			
			- int	(4byte, 32bit)
			
			  2^32(4,294,967,296)가지의 값을 표현할 수 있다.
			  int 타입 변수에 넣을 수 있는 정수의 범위는 -2,147,483,648 ~ +2,147,483,647(4,294,967,296가지)
			
			- long	(8byte, 64bit)
			
			  2^64가지의 값을 표현할 수 있다.
			  long 타입 변수에 넣을 수 있는 정수의 범위는 -(2^64 / 2) ~ +(2^64 / 2 - 1)(2^64가지)
		  
		# 실수 타입
		
			- float		(4byte)
			- double	(8byte)
			
		# 참조형 변수 타입
		
			- 문자열
			- 그 외 모든 타입(모든 클래스, 객체지향 관련 내용)

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte max_byte = 127, min_byte = -128;
		short max_short = 32767, min_short = -32768;
		// , 대신 _를 사용해 큰 숫자를 보기 편하게 적을 수 있다.
		int max_int = 2_147_483_647, min_int = -2_147_483_648;
		// int의 범위를 벗어나는 수는 뒤에 L을 붙여 long 타입 리터럴임을 명시해야 한다.
		long max_long = 9_223_372_036_854_775_807L, min_long = -9_223_372_036_854_775_808L;
		// char 타입에는 0 ~ 65535의 문자 코드를 정수 타입으로 보관할 수 있다(ASCII 코드표 검색)
		char ch1 = 'l', ch2 = 'u', ch3 = 'n', ch4 = 'c', ch5 = 'h';
		
		System.out.println("byte 타입에 들어갈 수 있는 가장 큰 값은 " + max_byte + "이고, " 
							+ "가장 작은 값은 " + min_byte + "입니다.");
		System.out.println("short 타입에 들어갈 수 있는 가장 큰 값은 " + max_short + "이고, " 
							+ "가장 작은 값은 " + min_short + "입니다.");
		System.out.println("int 타입에 들어갈 수 있는 가장 큰 값은 " + max_int + "이고, " 
							+ "가장 작은 값은 " + min_int + "입니다.");
		System.out.println("long 타입에 들어갈 수 있는 가장 큰 값은 " + max_long + "이고, " 
							+ "가장 작은 값은 " + min_long + "입니다.");
		System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);
		
		// 정수 리터럴의 기본 타입은 int
		// 실수 리터럴의 기본 타입은 double
		
		// 8byte 크기의 실수 리터럴을 float 타입 변수에 저장할 수 없으므로 
		// 뒤에 F를 붙여 float 타입 리터럴임을 명시해야 한다.
		float f1 = 123.123F;
		double d1 = 123.123;
		
		System.out.println("평균 점수: " + d1 + "점");
		System.out.println("평균 몸무게: " + f1 + "kg");
		
		// true, false 대신 1과 0을 사용하는 언어도 있다.
		boolean pass_exam = true;
		boolean gunpil = false;
		boolean late = true;
		
		System.out.println("통과 여부: " + pass_exam);
		System.out.println("군필: " + gunpil);
		System.out.println("지각 여부: " + late);
		
		String text = "My name is Lee Jae Sang.";
		
		System.out.println(text);
	}

}
