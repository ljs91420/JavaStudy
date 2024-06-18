
public class A05_TypeCasting {

	/*
		# 타입 크기순
		
		byte < short, char < int < long(8) < float(4) < double
		
		- 크기가 더 큰 타입의 변수에 작은 크기의 값을 넣을 때는 타입이 자동으로 변환된다(자연스러운 타입 캐스팅)
		
		- 크기가 더 작은 타입의 변수에 큰 값을 넣을 때는 타입을 강제로 변환해야 넣을 수 있다
		  (강제적인 타입 캐스팅, 값이 손상될 우려를 가지고 있다.)
	 */
	
	public static void main(String[] args) {
		
		// 작은 타입 값이 큰 타입에 들어갈 때는 별도의 조치 없이도 타입이 변한다.
		byte b1 = 127;
		
		short s1 = b1;
		int i1 = b1;
		long l1 = b1;
		
		// 큰 타입 값을 작은 타입에 넣을 때는 강제 타입 캐스팅으로 대입이 가능하지만 값이 손상될 수도 있다.
		int num = 128;
		byte bnum = (byte)num;
		
		System.out.println(bnum);
		
		double d1 = 123.1234565654;
		float f1 = (float)d1;
		int num2 = (int)d1;
		
		System.out.println(f1);
		System.out.println(num2);
		
		// 같은 2byte이지만 서로 강제 타입 캐스팅이 필요한 관계
		short snum = 333;
		char ch1 = '박';
		
		// char에 short값을 넣을 때는 음수값이 존재할 위험이 있으므로 강제형변환이 필요하다.
		char ch2 = (char)snum;
		
		// char에 short값을 넣을 때는 32767을 초과하는 양수가 존재할 위험이 있다.
		short snum2 = (short)ch1;
		
		System.out.println(ch2);
		System.out.println(snum2);
		
		// 문자의 코드를 보고 싶은 경우
		System.out.println((int)'가');
		
		// 해당 숫자에 해당하는 문자가 무엇인지 보고 싶은 경우
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);
		
		// 반올림
		System.out.println(Math.round(123.555));
		
		System.out.println(123.123456 * 10000);
		System.out.println(Math.round(123.123456 * 10000));
		System.out.println(Math.round(123.123456 * 10000) / 10000.0);
		
		System.out.println(40 / 7);
		System.out.println(40 / 7.0);
	}
}
