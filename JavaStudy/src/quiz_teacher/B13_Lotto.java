package quiz_teacher;

import java.util.Arrays;

public class B13_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, currIndex, buyCnt, winCnt;
		int[] winNums = new int[7];
		int[] usrNums = new int[6];
		boolean isNRepeated, hasBonus;
		
		currIndex = 0;
		
		while (currIndex < winNums.length) {
			n = (int)(Math.random() * 45) + 1;
			
			isNRepeated = false;
			
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == n) {
					isNRepeated = true;
					break;
				}
			}
			
			if (!isNRepeated) {
				winNums[currIndex] = n;
				++currIndex;
			}
		}
		
		buyCnt = 0;
		
		while (true) {
			++buyCnt;			
			currIndex = 0;
			
			while (currIndex < usrNums.length) {
				n = (int)(Math.random() * 45) + 1;
				
				isNRepeated = false;
				
				for (int i = 0; i < currIndex; ++i) {
					if (usrNums[i] == n) {
						isNRepeated = true;
						break;
					}
				}
				
				if (!isNRepeated) {
					usrNums[currIndex] = n;
					++currIndex;
				}
			}	
			
			// 당첨 체크
			winCnt = 0;
			hasBonus = false;
			
			for (int i = 0; i < usrNums.length; ++i) {
				for (int j = 0; j < winNums.length; ++j) {
					if (usrNums[i] == winNums[j]) {
						++winCnt;
						
						if (j == 6) {
							hasBonus = true;
						}
						
						break;
					}
				}
			}
			
			// Arrays.toString(arr) : 배열의 내용을 보기 좋게 문자열로 변환하는 함수
			System.out.print(buyCnt + "회 구매만에 ");
			
			System.out.printf("%s VS %s\n", Arrays.toString(winNums), Arrays.toString(usrNums));
			
			if (winCnt == 6) {
				if (hasBonus) {
					System.out.println("2등 당첨!");
					break;
				} else {
					System.out.println("1등 당첨!");
					break;
				}
			}
		}
	}

}
