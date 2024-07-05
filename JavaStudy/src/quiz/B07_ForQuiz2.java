package quiz;

public class B07_ForQuiz2 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i += 3) {
			System.out.print(i + " "); // 0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99
		}
		System.out.println();
		
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " "); // -35 -28 -21 -14 -7 0 7 14 21 28 35
		}
		System.out.println();
		
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " "); // 100 200 300 400 500 600 700 800 900 1000
		}
		System.out.println();
		
		for (int i = 50; i >= 0; --i) {
			System.out.print(i + " "); // 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		}
		System.out.println();
		
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " "); // 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
		}
		System.out.println();
		
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " "); // 10 9 8 7 6 5 4 3 2 1 10 9 8 7 6 5 4 3 2 1 10 9 8 7 6 5 4 3 2 1
		}
		System.out.println();
		
		long n = 7;
		
		for (int i = 0; i < 10; ++i) {
			System.out.print(n + " "); // 7 77 777 7777 77777 777777 7777777 77777777 777777777 7777777777
			n = n * 10 + 7;
		}
	}

}
