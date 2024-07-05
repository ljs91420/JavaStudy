package quiz;

import java.util.Scanner;

public class B11_Count369 {

	/*
		사용자가 숫자를 입력하면 해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇 번 쳐야하는지 출력하시오.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input, cnt = 0;
		
		System.out.print("숫자 입력: ");
		input = sc.nextInt();
		
		for (int i = 1; i <= input; ++i) {
			int n = i / 10;
			for (int j = 1; j <= n; ++j) {
				if (n % 3 == 0) {
					++cnt;
				}
			}
		}
		System.out.println(cnt);
	}

}
