package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 판별해주는 프로그램
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		int len = str.length();
		boolean isNumeric = true;
		
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			
//			isNumeric &= (ch >= '0' && ch <= '9');
			
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				break;
			}
		}
		
		if (isNumeric) {
			System.out.println("모두 숫자로만 구성되어 있습니다.");
		} else {
			System.out.println("숫자를 제외한 문자가 포함되어 있습니다.");
		}
	}

}
