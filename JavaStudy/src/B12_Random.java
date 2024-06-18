import java.util.Random;

public class B12_Random {

	/*
		# 무작위 숫자 생성하기
		
			1. java.util.Random 클래스 사용하기
			
			2. Math.random() 함수 사용하기
	 */
	
	public static void main(String[] args) {
		
		// 새로운 랜덤 시드 생성(생성 시점에서 모든 숫자가 결정된다)
		// 랜덤 시드를 생성하면서 원하는 시드 번호를 전달할 수도 있다.
		// 전달하지 않는 경우 현재 시간이 시드 번호가 된다.
		Random rnd1 = new Random(1000);
		Random rnd2 = new Random(1000);
		Random rnd3 = new Random(); // 현재 시간에 따라 랜덤 시드가 생성된다.
		
		// System.currentTimeMillis() : 현재 시간을 밀리초로 알려준다.
		System.out.println("현재 시간: " + System.currentTimeMillis());
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(rnd1.nextInt());
			System.out.println(rnd2.nextInt());
			System.out.println(rnd3.nextBoolean());
		}
		
		// 0 ~ n-1의 랜덤 정수 생성
		for (int i = 0; i < 10; ++i) {
			System.out.println(rnd3.nextInt(100)); // 0 ~ 99의 정수
		}
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(rnd3.nextInt(10) - 5); // -5 ~ 4
			System.out.println(rnd3.nextInt(10) + 5); // 5 ~ 14
		}
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(rnd3.nextInt(31) + 30); // 30 ~ 60
		}
		
		// Math.random() : 0 <= x < 1의 실수를 랜덤으로 생성
		for (int i = 0; i < 10; ++i) {
			System.out.println(Math.random());
		}
		
		/*
			# Math.random()으로 원하는 정수 만들기
			
				(1) 원하는 숫자의 개수를 곱한다.(bound 역할)
				
				(2) 소수점 아래를 잘라 정수로 만든다.
				
				(3) 더하거나 빼서 원하는 범위로 만든다.
		 */
		
		// 20 ~ 39의 랜덤 정수 만들어보기
		for (int i = 0; i < 10; ++i) {
			System.out.println((int)(Math.random() * 20) + 20);
		}
	}

}
