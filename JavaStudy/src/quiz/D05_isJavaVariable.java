package quiz;

import java.util.Scanner;

public class D05_isJavaVariable {

	/*
		사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요.
	 */
	
	static boolean checkJavaVariableFirst(String str) {
		return Character.isJavaIdentifierStart(str.charAt(0));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		boolean isJavaVariable = false;
		
		System.out.print("문자열 입력: ");
		str = sc.next();
		
		for (int i = 1; i < str.length(); ++i) {
			if (checkJavaVariableFirst(str) && Character.isJavaIdentifierPart(str.charAt(i))) {
				isJavaVariable = true;
			}
		}
		System.out.println(isJavaVariable);
	}
}
