package quiz;

public class B13_RandomScores {

	/*
		1. 100개의 점수를 랜덤으로 생성하여 배열에 저장(점수는 0 ~ 100점)
		
		2. 배열에 저장된 값을 한 줄에 10개씩 출력(단, 60점 미만인 점수는 X로 표시)
		
		3. 모든 점수의 평균 점수를 소수 둘째 자리까지 출력
		
		4. 생성된 랜덤 점수 중 가장 높은 점수와 가장 낮은 점수를 출력
		
		※ 모든 과정을 하나의 반복으로 처리하는 것은 금지
	 */
	
	public static void main(String[] args) {
		int[] scores = new int[100];
		int len = scores.length, cnt = 0, total = 0, max = 0, min = 100;
		double avg = 0;
		
		for (int i = 0; i < len; ++i) {
			scores[i] = (int)(Math.random() * 101);
		}
		
		for (int i = 0; i < len; ++i) {
			++cnt;
			
			if (cnt % 10 == 0) {
				System.out.printf("%4d\n", scores[i]);
			} else {
				System.out.printf("%4d", scores[i]);
			}
		}
		
		for (int i = 0; i < len; ++i) {
			total += scores[i];
			avg = (double)total / len;
		}
		System.out.printf("%.2f\n", avg);
		
		for (int i = 0; i < len; ++i) {
			if (scores[i] >= max) {
				max = scores[i];
			}
		}
		System.out.println(max);
		
		for (int i = 0; i < len; ++i) {
			if (scores[i] <= min) {
				min = scores[i];
			}
		}
		System.out.println(min);
	}

}
