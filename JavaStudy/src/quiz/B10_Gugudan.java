package quiz;

public class B10_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 9; ++i) {
			System.out.print(i + "단: ");
			for (int j = 1; j <= 9; ++j) {
				System.out.printf("%d * %d = %-2d ", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i <= 9; ++i) {
			for (int j = 2; j <= 9; ++j) {
				if (i == 0) {
					System.out.print(j + "단\t\t");
				} else {
					System.out.printf("%d * %d = %d\t", j, i, i * j);
				}
			}
			System.out.println();
		}
	}

}
