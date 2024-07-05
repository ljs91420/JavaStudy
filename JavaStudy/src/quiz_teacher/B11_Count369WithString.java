package quiz_teacher;

import java.util.Scanner;

public class B11_Count369WithString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input, cnt = 0;
		
		System.out.print("숫자 입력: ");
		input = sc.nextInt();
		
		// 1. 숫자를 문자열로 취급하여 검사하는 방식
		
		for (int i = 1; i <= input; ++i) {
			String str = "" + i;
			int len = str.length();
			
			for (int index = 0; index < len; ++index) {
				char ch = str.charAt(index);
				if (ch == '3' || ch == '6' || ch == '9') {
					++cnt;
				}
			}
		}
		System.out.println(cnt);
	}

}
