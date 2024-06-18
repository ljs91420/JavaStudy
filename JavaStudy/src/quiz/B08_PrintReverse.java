package quiz;

import java.util.Scanner;

public class B08_PrintReverse {
	
	/*
		사용자가 문장을 입력하면 해당 문장을 거꾸로 출력
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String text;
		
		System.out.print("문장 입력: ");
		text = sc.nextLine();
		
		int len = text.length();
		
		for (int i = len - 1; i >= 0; --i) {
			char ch = text.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		
		for (int i = 0; i < len; ++i) {
			System.out.print(text.charAt(len - 1 - i));
		}
	}

}
