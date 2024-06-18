package quiz;

import java.util.Scanner;

public class B08_Palindrome {

	/*
		팰린드롬
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String word, reversed = "";
		
		System.out.print("단어 입력: ");
		word = sc.next();
		
		int len = word.length();
		
		for (int i = 0; i < len; ++i) {
			reversed += word.charAt(len - 1 - i);
		}
		
		if (word.equalsIgnoreCase(reversed)) {
			System.out.println("좌우대칭입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다.");
		}
	}

}
