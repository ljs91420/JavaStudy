
public class B07_For {

	/*
		# 반복문 (Loop)
		
			- for, while, forEach, do-while(X)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 10000; i *= 2) {
			System.out.println(i);
		}
		
//		for (int i = -128; i <= 127; ++i) {
//			System.out.println(i); // -128 ~ 127
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i <= 65535; ++i) {
//			System.out.println((char)i); // 0번째 문자 ~ 65535번째 문자
//		}
		
//		for ( ; ; ) {
//			System.out.println("무한 반복"); // 무한 반복
//		}
		
		int a = 1;
		for ( ; a < 10; ) {
			System.out.println("프로그램이 끝났습니다. " + a++);
		}
	}

}
