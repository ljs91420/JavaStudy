package quiz_teacher;

public class B13_RandomScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = new int[100];
		int total = 0, max = 0, min = 100;
		
		// 1.
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 101);
		}
		
		// 2.
		for (int i = 0; i < scores.length; ++i) {
			if (scores[i] < 60) {
				System.out.print("X\t");
			} else {
				System.out.print(scores[i] + "\t");
			}
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		
		// 3.
		for (int i = 0; i < scores.length; ++i) {
			total += scores[i];
		}
		System.out.printf("%.2f\n", total / (double)scores.length);
		
		// 4.
		for (int i = 0; i < scores.length; ++i) {
			// 삼항연산자
			max = max > scores[i] ? max : scores[i];
			min = min < scores[i] ? min : scores[i];
			
//			max = Math.max(max, scores[i]);
//			min = Math.min(min, scores[i]);
			
//			if (scores[i] > max) {
//				max = scores[i];
//			}
//			
//			if (scores[i] < min) {
//				min = scores[i];
//			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
