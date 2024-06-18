package quiz;

import java.util.Scanner;

public class B00_WonToDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한화를 입력하면 달러화로 얼마인지 출력해주는 프로그램을 만들어보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한화(원) = ");
		int krw = sc.nextInt();
		
		double exchangeRate = 1_374.30;
		
		double usd = krw / exchangeRate;
				
		System.out.printf("달러화(달러) = %.2f\n", usd);
	}

}
