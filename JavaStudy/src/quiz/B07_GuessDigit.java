package quiz;

import java.util.Scanner;

public class B07_GuessDigit {

	/*
		사용자가 int 타입 값을 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input, digits = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		input = sc.nextInt();
		
		for (int i = input; i >= 10; i /= 10) {
				++digits;
		}
		System.out.println(digits + "자리 숫자");
	}

}
