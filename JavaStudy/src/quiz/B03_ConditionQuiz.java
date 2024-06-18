package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.println(a > 10 && a < 20);
		
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.println(b % 2 == 0);
		
		System.out.print("c: ");
		int c = sc.nextInt();
		System.out.println(c % 7 == 0);
		
		System.out.print("d: ");
		int d = sc.nextInt();
		System.out.print("e: ");
		int e = sc.nextInt();
		System.out.println(Math.abs(d - e) == 30);
		
		System.out.print("year: ");
		int year = sc.nextInt();
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		
		System.out.print("powerOn: ");
		boolean powerOn = sc.nextBoolean();
		System.out.println(!powerOn);
		
		System.out.print("str: ");
		String str = new Scanner(System.in).next();
		// String str = "yes";
		// 참조형 변수들은 == 대신 .equals() 메소드를 사용해야 한다.
		System.out.println(str.equals("yes"));
	}

}
