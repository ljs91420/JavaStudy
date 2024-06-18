package quiz;

import java.util.Scanner;

public class B00_PriceCalculator2 {

	/*
		4가지 음료수 갯수를 입력하면 총 가격을 출력해보세요.
		(각 음료수의 가격은 2300, 2800, 3300, 3500원입니다.)
		
		ex) 0 5 0 1
			17500
			
			3 1 1 1
			16500
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unitPrice1 = 2300;
		int unitPrice2 = 2800;
		int unitPrice3 = 3300;
		int unitPrice4 = 3500;
		
		System.out.printf("1번 음료 : %d원\n", unitPrice1);
		System.out.printf("2번 음료 : %d원\n", unitPrice2);
		System.out.printf("3번 음료 : %d원\n", unitPrice3);
		System.out.printf("4번 음료 : %d원\n", unitPrice4);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음료수 갯수 입력: ");
		
		// 블록 지정 후 Ctrl + /
//		 int beverage1 = sc.nextInt();
//		 int beverage2 = sc.nextInt();
//		 int beverage3 = sc.nextInt();
//		 int beverage4 = sc.nextInt();
		
		System.out.println(sc.nextInt() * unitPrice1 + sc.nextInt() * unitPrice2 
							+ sc.nextInt() * unitPrice3 + sc.nextInt() * unitPrice4);
	}

}
