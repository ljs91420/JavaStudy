
public class B04_If {

	/*
		# if문
		
		# else if문
		
		# else문
		
			- 위의 if, else if가 모두 false이면 {} 안의 내용을 무조건 실행
			- 어떤 상황에서도 반드시 실행을 보장하고 싶을 때 사용
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9999;
		
		if (a < 15) {
			System.out.println("a의 값이 15보다 작아서 출력되었습니다.");
		} else if (a < 25) {
			System.out.println("a의 값이 15보다 크고 25보다 작아서 출력되었습니다.");
		} else if (a < 35) {
			System.out.println("a의 값이 25보다 크고 35보다 작아서 출력되었습니다.");
		} else {
			System.out.println("위의 모든 조건을 만족시키지 못하여 출력되었습니다.");
		}
		
		int num;
		
		if (a % 2 == 0) {
			num = 7;
		} else {
			num = 8;
		}
		
		System.out.println(num);
		
		System.out.println("프로그램이 끝났습니다.");
	}

}
