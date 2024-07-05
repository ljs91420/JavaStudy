
public class B10_InnerLoop {

	public static void main(String[] args) {
		// 반복문 내부에 반복문 사용하기
		
		/*
			# 다중 반복으로 구구단 출력해보기
		 */
		
		for (int i = 1; i <= 9; ++i) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; ++j) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
