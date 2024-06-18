package quiz;

import java.util.Scanner;

import myobj.Game31;

public class C05_31Game {

	/*
		# 31 Game
		
			- 프로그램을 시작하면 게임에 참여하는 인원과 마지막 숫자를 설정한다.
			- 이전 사람이 골랐던 숫자에 +1 ~ +3씩 더할 수 있다.
			- 게임을 진행하다가 마지막 숫자를 입력하게 되는 사람이 패배한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Game31 game = new Game31();
		
		System.out.print("게임에 참여하는 인원 수 입력: ");
		game.people = new int[sc.nextInt()];
		
		System.out.print("마지막 숫자 입력: ");
		game.end = sc.nextInt();
		
		while (true) {			
			System.out.print("더할 값 입력: ");
			game.add(sc.nextInt());
			
			if (game.num >= game.end) {
				System.out.println("패배!");
				break;
			}
		}
	}
}
