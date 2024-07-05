package example;

import java.util.Scanner;

public class OvenTimer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, timer, finishMinute;
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		timer = sc.nextInt();
		
		finishMinute = minute + timer;
		
		if (finishMinute > 59) {
			hour = (hour + finishMinute / 60) % 24;
			finishMinute %= 60;
		}
		
		System.out.printf("요리 완성 예상 시간: %d시 %d분\n", hour, finishMinute);
	}

}
