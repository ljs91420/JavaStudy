
public class B11_While {

	/*
		# while문
		
			- 증감값의 위치에 따라 결과가 달라질 수 있으므로 주의
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 ~ 9 (10개)
		int i = 0;
		while (i < 10) {
			System.out.println("Hello!" + i++);
		}
		System.out.println();
		
		// 1 ~ 10 (10개)
		i = 0;
		while (i < 10) {
			System.out.println("Hello!" + ++i);
		}
		System.out.println();
		
		// 1 ~ 10 (10개)
		i = 0;
		while (i++ < 10) {
			System.out.println("Hello!" + i);
		}
		System.out.println();
		
		// 1 ~ 9 (9개) : 직관적이지 않아서 잘 쓰지 않음
		i = 0;
		while (++i < 10) {
			System.out.println("Hello!" + i);
		}
	}

}
