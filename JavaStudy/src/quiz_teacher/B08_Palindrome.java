package quiz_teacher;

import java.util.Scanner;

public class B08_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.print("단어 입력: ");
		word = sc.next();
		
		String lowerWord = word.toLowerCase();
		
		int len = lowerWord.length();
		int half = len / 2;
		
		boolean isPalindrome = true;
		
		for (int i = 0; i < half; ++i) {
			char ch1 = lowerWord.charAt(i);
			char ch2 = lowerWord.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				isPalindrome = false;
			}
		}
		
		if (isPalindrome) {
			System.out.println("좌우대칭입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다.");
		}
	}

}
