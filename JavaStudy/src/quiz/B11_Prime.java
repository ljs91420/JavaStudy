package quiz;

import java.util.Scanner;

public class B11_Prime {

	/*
		사용자가 정수를 입력하면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력
		
		※ 소수(Prime) : 약수가 1과 자기 자신 밖에 없는 수
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input, i = 2;
		
		System.out.print("정수 입력: ");
		input = sc.nextInt();
		
		while (i <= input) {
			if (i % i != 0) {
				System.out.print(i + " ");
			}
			++i;
		}
	}

}
