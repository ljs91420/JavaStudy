package quiz_teacher;

import java.util.Scanner;

public class B11_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target, cnt;
		
		System.out.print("정수 입력: ");
		target = sc.nextInt();
		
		for (int check = 2; check <= target; ++check) {
			cnt = 0;
			for (int divider = 1; divider <= check; ++divider) {
				if (check % divider == 0) {
					if (divider != check) {
						System.out.print(divider + " ");
					} else {
						System.out.print(divider);
					}
					++cnt;
				}
			}
			if (cnt == 2) {
				System.out.print(" *소수");
			}
			System.out.println();
		}
		
	}

}
