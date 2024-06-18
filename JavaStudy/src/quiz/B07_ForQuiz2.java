package quiz;

public class B07_ForQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 50; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " ");
		}
		System.out.println();
		
		long n = 7;
		
		for (int i = 0; i < 10; ++i) {
			System.out.print(n + " ");
			n = n * 10 + 7;
		}
	}

}
