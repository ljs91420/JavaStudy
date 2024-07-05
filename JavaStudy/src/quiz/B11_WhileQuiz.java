package quiz;

public class B11_WhileQuiz {

	/*
		1. 100 ~ 200 사이의 13의 배수를 모두 출력
		
		2. 50부터 100 사이의 모든 숫자의 총합 출력
		
		3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력
		
		4. 1부터 19까지 모든 숫자의 곱을 출력
		
		5. 8999 ~ 4999 사이에 있는 5번째 287의 배수 출력
	 */
	
	public static void main(String[] args) {
		int i = 100, tot = 0, cnt = 0;
		
		while (i <= 200) {
			if (i % 13 == 0) {
				System.out.print(i + " "); // 104 117 130 143 156 169 182 195
			}
			++i;
		}
		System.out.println();
		
		i = 50;
		
		while (i <= 100) {
			tot += i++;
		}
		System.out.println(tot); // 3825
		
		i = 1;
		
		while (i <= 1000) {
			if (i % 10 == 0) {
				System.out.printf("%5d", i);
				
				if (++cnt % 8 == 0) {
					System.out.println();
				}
			}
			++i;
		}
		System.out.println();
		
		i = 1;
		long tot2 = 1;
		
		while (i <= 19) {
			tot2 *= i++;
		}
		System.out.println(tot2); // 121645100408832000
		
		i = 8999;
		cnt = 0;
		
		while (i >= 4999) {	
			if (i % 287 == 0 && ++cnt == 5) {
				System.out.println(i); // 7749
				break;
			}
			--i;
		}
	}

}
