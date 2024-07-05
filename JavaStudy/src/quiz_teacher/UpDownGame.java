package quiz_teacher;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans, guess, maxChance = 6, currMax = 101, currMin = 0, usrTry = 0;
		
		ans = (int)(Math.random() * 100) + 1;
		
		while (true) {
			if (usrTry == maxChance) {
				System.out.printf("모든 기회를 사용하셨습니다. 정답은 %d였습니다.\n", ans);
				break;
			}
			
			System.out.print("숫자 입력: ");
			guess = sc.nextInt();
			
			if (guess >= currMax || guess <= currMin) {
				System.out.printf("추측 범위를 벗어난 숫자입니다.\n현재 추측 범위는 %d 초과 %d 미만입니다. (남은 기회: %d)\n", 
									currMin, currMax, maxChance - usrTry);
				continue;
			}
			
			++usrTry;
			
			if (guess == ans) {
				System.out.printf("%d번 만에 정답!\n", usrTry);
				break;
			} else if (guess < ans) {
				System.out.printf("Up! (남은 기회: %d)\n", maxChance - usrTry);
				currMin = guess;
			} else if (guess > ans) {
				System.out.printf("Down! (남은 기회: %d)\n", maxChance - usrTry);
				currMax = guess;
			}
		}
	}

}
