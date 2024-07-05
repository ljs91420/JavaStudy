package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz2 {

	// 1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	public static void mixed(String str) {
		char[] chArr = new char[str.length()];
		
		for (int i = 0; i < chArr.length; ++i) {
			chArr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < 100; ++i) {
			int randomIndex = (int)(Math.random() * (chArr.length - 1)) + 1;
			
			char tmp = chArr[0];
			chArr[0] = chArr[randomIndex];
			chArr[randomIndex] = tmp;
		}
		
		System.out.println(chArr);
	}
	
	// 2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	public static String reversed(String str) {
		char[] chArr = new char[str.length()];
		
		for (int i = 0; i < chArr.length; ++i) {
			chArr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < chArr.length / 2; ++i) {
			char tmp = chArr[i];
			chArr[i] = chArr[chArr.length - 1 - i];
			chArr[chArr.length - 1 - i] = tmp;
		}
		
		String str2 = "";
		
		for (int i = 0; i < chArr.length; ++i) {
			str2 += chArr[i];
		}
		
		return str2;
	}
	
	// 3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	public static boolean isPalindrome(String str) {
		return str.equalsIgnoreCase(reversed(str));
	}
	
	// 4. 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	public static int[] lotto() {
		int[] nums = new int[7];
		
		int currIndex = 0;
		
		while (currIndex < nums.length) {
			int num = (int)(Math.random() * 45) + 1;
			
			boolean isRepeated = false;
			
			for (int i = 0; i < currIndex; ++i) {
				if (nums[i] == num) {
					isRepeated = true;
					break;
				}
			}
			
			if (!isRepeated) {
				nums[currIndex] = num;
				++currIndex;
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		mixed("안녕하세요");
		System.out.println(reversed("안녕하세요")); // 요세하녕안
		System.out.println(isPalindrome("Level")); // true
		System.out.println(Arrays.toString(lotto()));
	}

}
