package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.Baseball;

public class C05_BaseballGame {

	/*
		숫자 야구 게임을 만들어보세요.
		
			1. 게임이 시작되면 정답이 랜덤으로 생성된다.(정답은 랜덤 4자리의 중복 없는 숫자)
			
			2. 플레이어에게는 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다.
			
			3. 플레이어가 입력한 숫자와 위치가 정답의 것과 모두 일치하면 스트라이크
			
			4. 플레이어가 입력한 숫자는 맞고 위치가 다르면 볼
			
			5. 9번의 기회 안에 모든 숫자와 위치를 맞추면 플레이어의 승리
			
			6. 모든 기회 소진 시 플레이어의 패배
	 */
	
	public static void main(String[] args) {
		Baseball ans = new Baseball();
		int[] nums = new int[4];
		int maxChance = 9, len = nums.length;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			System.out.print("숫자 4개 입력: ");
			
			nums[0] = sc.nextInt();
			nums[1] = sc.nextInt();
			nums[2] = sc.nextInt();
			nums[3] = sc.nextInt();
			
			for (int i = 0; i < len; ++i) {
				for (int j = 0; j < ans.len; ++j) {
					
				}
			}
		}
	}

}
