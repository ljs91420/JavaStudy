package quiz;

import java.util.Scanner;

public class B07_ForQuiz3 {

	/*
		사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력
		(단, 음수를 입력 받는 경우에도 올바르게 동작해야 함)
	 */
	
	public static void main(String[] args) {
		int n, cnt = 0, abs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		n = sc.nextInt();
		
		abs = Math.abs(n);
		
		for (int i = 0; i <= abs; ++i) {
			if (i % 3 == 0) {
				if (n < 0) {
					System.out.printf("%+d\t", -i);
				}
				else {
					System.out.printf("%+d\t", i);
				}
				
				if (++cnt % 6 == 0) {
					System.out.println();
				}
			}
		}
		
//		if (n < 0) {
//			for (int i = 0; i >= n; --i) {
//				if (i % 3 == 0) {
//					System.out.print("" + i + '\t');
//					
//					if (++cnt % 6 == 0) {
//						System.out.println();
//					}
//				}
//			}
//		}
//		else {
//			for (int i = 0; i <= n; ++i) {
//				if (i % 3 == 0) {
//					++cnt;
//					if (cnt % 6 == 0) {
//						System.out.print(i + "\n");
//					}
//					else {
//						System.out.print(i + " ");
//					}
//				}
//			}
//		}
	}

}
