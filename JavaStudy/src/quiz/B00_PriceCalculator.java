package quiz;

import java.util.Scanner;

public class B00_PriceCalculator {

	public static void main(String[] args) {
		// 음료수 갯수를 입력하면 총 가격을 출력해보세요.(음료수는 개당 2300원입니다)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음료수 갯수 입력: ");
		int beverageQty = sc.nextInt();
		
		int unitPrice = 2300;
		
		System.out.printf("총가격은 %d원입니다.", beverageQty * unitPrice);
	}

}
