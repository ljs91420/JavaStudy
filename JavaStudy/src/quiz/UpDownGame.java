package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	/*
		# UpAndDown 게임을 만들어보세요.
		
			1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자가 정답이 된다.
			
			2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다.
			
			3. 만약 사용자가 현재 좁혀놓은 범위를 벗어나는 숫자를 입력했다면 기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다.
			
			4. 6번 안에 못 맞추면 정답이 무엇이었는지 알려주고 프로그램을 종료한다.
			
			5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램을 종료한다.
	 */
	
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rndNum, usr, cnt = 0;
		
		rndNum = (int)(Math.random() * 100) + 1;
		
		while (true) {
			System.out.print("숫자 입력: ");
			usr = sc.nextInt();
			
			++cnt;
			
			if (usr < rndNum) {
				System.out.println("Up!");
			} else if (usr > rndNum) {
				System.out.println("Down!");
			} else {
				System.out.printf("축하합니다! %d번 만에 정답을 맞추셨습니다!", cnt);
				break;
			}
			
			if (cnt > 5) {
				System.out.printf("아쉽습니다. 정답은 %d였습니다.", rndNum);
				break;
			}
		}
	}

}
