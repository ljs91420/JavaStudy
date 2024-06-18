package quiz;

public class B07_ForQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 100; i <= 200; ++i) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for (int i = 50; i <= 100; ++i) {
			sum += i;
		}
		System.out.println("총합: " + sum);
		System.out.println();
		
		int cnt = 0;
		
		for (int i = 1; i <= 1000; ++i) {
			if (i % 10 == 0) {
				System.out.printf("%6d", i);
				
				++cnt;
				
				if (cnt % 8 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println();
		
		long total = 1;
		
		for (int i = 1; i <= 19; ++i) {
			total *= i;
		}
		System.out.println(total);
		System.out.println();
		
		int cnt2 = 0;
		
		for (int i = 8999; i >= 4999; --i) {
			if (i % 287 == 0) {
				++cnt2;
				
				if (cnt2 == 5) {
					System.out.println(i);
				}
			}
		}
	}

}
