package quiz;

import java.util.Scanner;

public class B08_CountE {

	/*
		사용자가 문장을 입력하면 해당 문장에 포함된 알파벳 e의 갯수를 출력하는 프로그램 만들기
		(대/소문자 모두 포함)
	 */
	
	public static void main(String[] args) {
		String str;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		str = sc.nextLine();
		
		int len = str.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			if (ch == 'E' || ch == 'e') {
				++cnt;
			}
		}
		System.out.println(cnt);
	}

}
