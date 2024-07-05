package quiz_teacher;

import java.util.Scanner;

public class B11_Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target;
		boolean isPrime = true;
		
		System.out.print("정수 입력: ");
		target = sc.nextInt();
		
		for (int check = 2; check <= target; ++check) {
			double sqrt = Math.sqrt(check);
			for (int divider = 2; divider < sqrt; ++divider) {
				if (check % divider != 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아니다.");
		}
	}

}
