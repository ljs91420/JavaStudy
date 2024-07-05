package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz2 {

	public static void main(String[] args) {
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q'); // true
		
		char b = '	';
		System.out.println(b != ' ' && b != '\t'); // false
		System.out.println(!(b == ' ' || b == '\t')); // false
		
		char c = '0';
		System.out.println(c >= '0' && c <= '9'); // true
		
		char d = 'a';
		System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z'); // true
		
		char e = '가';
		System.out.println(e >= '가' && e <= '힣'); // true
		
		System.out.print("문자열 입력: ");
		String str = new java.util.Scanner(System.in).next();
		System.out.println(str.equals("quit"));
		System.out.println(str.equalsIgnoreCase("quit"));
	}

}
