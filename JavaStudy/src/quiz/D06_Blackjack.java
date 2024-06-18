package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D06_Blackjack {

	/*
		1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑아야 한다.
		
		2. 처음에는 둘 모두 2장씩 받는다. 이때 딜러의 카드는 한 장 가려놓아야 한다.
		
		3. 플레이어는 카드를 받은 후 상황을 보고 계속 뽑을지(hit) 그만 뽑을지(stand)를 결정해야 한다.
		
		4. 플레이어가 hit를 선택하면 카드를 한 장 더 받는다.
		
		5. 플레이어가 stand를 선택하면 딜러는 가려놨던 카드를 오픈한 후 카드를 뽑기 시작한다.
		   이때 딜러는 의사결정을 할 수 없고 정해진 규칙에 따라야 한다.
		   
		   ※ 딜러의 규칙 - 가진 카드의 합이 16 이하라면 뽑는다. 17 이상이면 멈춘다.
		   
		6. J, Q, K는 모두 10의 가치를 지닌다.
		
		7. A는 필요에 따라 1로 쓸 수도 있고 11로 쓸 수도 있다.
		   (A는 11의 가치를 지니고 있다가 카드의 합이 21이 넘어가면 1이 된다.)
		   
		8. 가진 카드의 합이 21을 넘어가면 버스트, 정확하게 21이면 블랙잭이다.
		   플레이어가 버스트를 당하면 딜러는 카드를 뽑지도 않고 승리한다.
		   
		참고자료 - https://www.247blackjack.com/
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> dealerCards = new ArrayList<>();
		ArrayList<Integer> playerCards = new ArrayList<>();
		String playerDeal;
		int playerScore, dealerScore;
		
		dealerCards.add((int)(Math.random() * 11) + 1);
		dealerCards.add((int)(Math.random() * 11) + 1);
		
		playerCards.add((int)(Math.random() * 11) + 1);
		playerCards.add((int)(Math.random() * 11) + 1);
		
		System.out.println("딜러가 오픈한 카드: " + dealerCards.get(0));
		System.out.println("플레이어의 카드: " + playerCards);
		
		playerScore = 0;
		for (int i = 0; i < playerCards.size(); ++i) {
			playerScore += playerCards.get(i);
		}
		System.out.println("플레이어의 점수: " + playerScore);
		
		while (playerScore < 21) {
			System.out.print("hit 또는 stand를 입력: ");
			playerDeal = sc.next();
			
			if (playerDeal.equalsIgnoreCase("hit")) {
				playerCards.add((int)(Math.random() * 11) + 1);
				playerScore = 0;
				for (int i = 0; i < playerCards.size(); ++i) {
					playerScore += playerCards.get(i);
				}
				System.out.println("플레이어의 점수: " + playerScore);
			}
			
			if (playerDeal.equalsIgnoreCase("stand")) {
				System.out.println("딜러가 가려놨던 카드: " + dealerCards.get(1));
				
				dealerScore = 0;
				for (int i = 0; i < dealerCards.size(); ++i) {
					dealerScore += dealerCards.get(i);
				}
				
				while (dealerScore <= 16) {
					dealerCards.add((int)(Math.random() * 11) + 1);
					
					dealerScore = 0;
					for (int i = 0; i < dealerCards.size(); ++i) {
						dealerScore += dealerCards.get(i);
					}
					System.out.println("딜러의 점수: " + dealerScore);
				}
				System.out.println("딜러의 점수: " + dealerScore);
				
				if (playerScore == dealerScore) {
					System.out.println("무승부입니다!");
				}
				
				if (playerScore > dealerScore) {
					System.out.println("플레이어의 승리입니다!");
				}
				
				if (playerScore < dealerScore) {
					System.out.println("딜러의 승리입니다! 플레이어는 패배했습니다...");
				}
			}
		}
		
		if (playerScore == 21) {
			System.out.println("블랙잭! 플레이어의 승리입니다!");
		}
		
		if (playerScore > 21) {
			System.out.println("버스트! 딜러의 승리입니다! 플레이어는 패배했습니다...");
		}
	}
}
