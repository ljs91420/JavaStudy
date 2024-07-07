package quiz;

import java.util.Scanner;

public class D09_IsPhoneNumber {

	/*
		전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열 입력: ");
		str = sc.next();
		
		System.out.println(checkPhoneNumber(str));
	}
	
	static boolean checkPhoneNumber(String str) {
		int middleNumbers = Integer.valueOf(str.substring(4, 8));
		int lastNumbers = Integer.valueOf(str.substring(9));
		
		return str.length() == 13 && str.startsWith("010") && str.substring(3, 4).equals("-") 
				&& middleNumbers >= 1000 && middleNumbers <= 9999 && lastNumbers >= 1000 && lastNumbers <= 9999 
				&& str.substring(8, 9).equals("-");
	}
}
