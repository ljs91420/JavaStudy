package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			int apples;
			int basketSize = 10;
			int baskets;
			
			System.out.println("바구니의 크기: " + basketSize);
			
			System.out.print("사과의 총 갯수: ");
			apples = sc.nextInt();
			
			if (apples < 0) {
				System.out.println("사과의 갯수를 잘못 입력하셨습니다. 다시 입력하여 주십시오.");
			} else if (apples % basketSize == 0) {
				baskets = apples / basketSize;
				System.out.println("바구니의 갯수: " + baskets);
				break;
			} else {
				baskets = apples / basketSize + 1;
				System.out.println("바구니의 갯수: " + baskets);
				break;
			}
		}
	}

}
