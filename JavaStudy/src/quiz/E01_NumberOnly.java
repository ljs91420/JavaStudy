package quiz;

import java.util.Scanner;

public class E01_NumberOnly {

	/*
		사용자로부터 스캐너의 nextInt()로 숫자를 입력받되 숫자가 아닌 것을 입력하더라도 
		프로그램이 강제 종료되지 않고 다시 입력받을 수 있게 만들어보세요.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while (true) {
			try {
				System.out.print("숫자 입력: ");
				n = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("숫자가 아닌 것을 입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
			}
		}
	}
}
