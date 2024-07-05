package quiz_teacher;

import java.util.Scanner;

public class B11_Count369WithInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input, cnt = 0;
		
		System.out.print("숫자 입력: ");
		input = sc.nextInt();
		
		// 2. 그냥 숫자로 검사하는 방식
		
		for (int i = 1; i <= input; ++i) {
			int n = i;
			
			while (n > 0) {
				int digit = n % 10;
				
				if (digit != 0 && digit % 3 == 0) {
					++cnt;
				}
				n /= 10;
			}
		}
		System.out.println(cnt);
		
//		for (int i = 1; i <= input; ++i) {
//			long digit = 1;
//			int n = (int)(i / digit % 10);
//			
//			while (digit <= 1_000_000_000) {
//				if (n != 0 && n % 3 == 0) {
//					++cnt;
//				}
//				digit *= 10;
//			}
//		}
//		System.out.println(cnt);
	}

}
