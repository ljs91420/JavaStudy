package quiz;

import java.util.Scanner;

import myobj.Pirate;
import myobj.Player;

public class C05_PirateGame {

	/*
		통아저씨 게임을 만들어보세요.
		
			1. 게임이 시작되면 꽝 자리가 정해진다.
			
			2. 플레이어는 아저씨가 튀어나올 때까지 돌아가면서 계속 자리를 선택해야 한다.
			   (플레이어는 4명으로 고정한다.)
			
			3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다.
			   (꽝의 위치는 매 판 시작 시 랜덤으로 설정된다.)
			
			4. 아저씨가 발사되면 해당 플레이어의 점수를 깎고 나머지의 점수를 찌르는 데 성공한 횟수에 비례하여 증가시킨다.
			
			5. 각 게임이 끝날 때 순위에 따라 소지금이 변동된다.
			   (1위 +1000, 2위 +500, 3위 -500, 4위 -1000))
			
			6. 게임을 그만하겠다고 하거나 한 사람의 점수가 -가 된다면 게임이 종료된다.
			   게임이 종료되면서 최종 스코어를 출력한다.
			   (이름, 점수, 남은 소지금(+얼마 벌었나) 등)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] losePoints = new int[4];
		String[] players = {"name1", "name2", "name3", "name4"};
		int[] guesses = new int[players.length];
		int[] scores = new int[players.length];
		int[] funds = new int[players.length];
		
		for (int i = 0; i < losePoints.length; ++i) {
			losePoints[i] = (int)(Math.random() * 20) + 1;
			
			for (int j = 0; j < i; ++j) {
				if (losePoints[j] == losePoints[i]) {
					--i;
					break;
				}
			}
		}
		
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = 100;
		}
		
		for (int i = 0; i < funds.length; ++i) {
			funds[i] = 10000;
		}
		
		while (true) {
			for (int i = 0; i < guesses.length; ++i) {
				guesses[i] = sc.nextInt();
				for (int j = 0; j < losePoints.length; ++j) {
					if (guesses[i] == losePoints[j]) {
						--scores[i];
						break;
					}
				}
			}
		}
	}

}
