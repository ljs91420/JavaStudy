package quiz;

public class B13_Lotto {

	/*
		1. 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호를 만들어보세요.
		
		2. 1등 또는 2등에 당첨될 때까지 랜덤 로또 번호를 계속 생성하여 몇 번 만에 당첨되었는지 출력해보세요.
		
			- 로또 구매자의 번호는 6개다.
			- 보너스 번호를 제외하고 모두 맞추면 1등
			- 보너스 번호를 포함하여 모두 맞추면 2등
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] lotto = new int[7];
//		
//		for (int i = 0; i < lotto.length; ++i) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//			for (int j = 0; j < i; ++j) {
//				if (lotto[j] == lotto[i]) {
//					lotto[i] = (int)(Math.random() * 45) + 1;
//				}
//			}
//			System.out.print(lotto[i] + " ");
//		}
		
		int n, currIndex = 0, cnt = 0, winCnt;
		int[] winNums = new int[7];
		int[] guessNums = new int[6];
		boolean isNRepeated, isWon;
		
		while (currIndex < 7) {
			n = (int)(Math.random() * 45) + 1;
			
			// 이번에 뽑은 숫자 n이 중복이 일단 아니라고 설정 해둔다
			isNRepeated = false;
			
			// n이 이전에 뽑은 숫자중에 있는지 검사한다
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == n) {
					isNRepeated = true; // 걸리면 n을 중복이라고 설정한다
					break;
				}
			}
			
			if (!isNRepeated) {
				winNums[currIndex] = n;
				++currIndex;
			}
		}
		
		for (int i = 0; i < winNums.length; ++i) {
			System.out.print(winNums[i] + " ");
		}
		System.out.println();
		
		while (true) {		
			currIndex = 0;
			
			while (currIndex < 6) {
				n = (int)(Math.random() * 45) + 1;
				
				isNRepeated = false;
				
				for (int i = 0; i < currIndex; ++i) {
					if (guessNums[i] == n) {
						isNRepeated = true;
						break;
					}
				}
				
				if (!isNRepeated) {
					guessNums[currIndex] = n;
					++currIndex;
				}
			}
			
			for (int i = 0; i < guessNums.length; ++i) {
				System.out.print(guessNums[i] + " ");
			}
			System.out.println();			

			++cnt;
			
			winCnt = 0;
			
			for (int i = 0; i < winNums.length; ++i) {
				for (int j = 0; j < guessNums.length; ++j) {
					if (guessNums[j] == winNums[i]) {
						++winCnt;
					}
				}
			}
			
			if (winCnt == 6) {
				System.out.printf("%d번 만에 1등에 당첨되었습니다!\n", cnt);
				break;
			}
		}
	}

}
