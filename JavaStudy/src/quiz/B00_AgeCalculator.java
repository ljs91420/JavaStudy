package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {
	
	public static void main(String[] args) {
		// 이름과 태어난 연도를 입력하면 이름과 나이를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 연도 입력 >> ");
		
		String name = sc.next();
		int bornYear = sc.nextInt();
		
		int thisYear = 2024;
		int age = thisYear - bornYear + 1;
		
		System.out.printf("%s(%d세)\n", name, age);
	}

}
