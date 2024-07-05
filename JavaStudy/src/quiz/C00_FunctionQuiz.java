package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz {

	/*
		# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요.
		
			1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
			2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
			3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
			4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
			5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
			6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 */
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isAlphabet(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] getSubmultiples(int num) {
		int[] submultiples = new int[num];
		int index = 0;
		
		// num : 전달 받은 숫자
		// div : 전달 받은 숫자를 나눠볼 숫자
		for (int div = 1; div <= num; ++div) {
			if (num % div == 0) {
				// ++이 뒤에 들어갔으므로 대입을 하고 난 후 index가 증가한다.
				submultiples[index++] = div;
			}
		}
		
		return Arrays.copyOf(submultiples, index);
	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		return getSubmultiples(num).length == 2;
	}
	
	// 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	public static void printMessages(String message, int num) {
		for (int i = 0; i < num; ++i) {
			System.out.print(message);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('김')); // false
		System.out.println(isAlphabet('L')); // true
		System.out.println(isMul3(20)); // false
		System.out.println(isMul3(27)); // true
		System.out.println(checkEvenOdd(123)); // 홀수입니다.
		System.out.println(checkEvenOdd('이')); // 가능은 하지만 의미 없는 짓
		System.out.println(Arrays.toString(getSubmultiples(20))); // [1, 2, 4, 5, 10, 20]
		System.out.println(isPrime(8)); // false
		System.out.println(isPrime(9)); // false
		System.out.println(isPrime(11)); // true
		printMessages("Hello", 3); // HelloHelloHello
	}

}
