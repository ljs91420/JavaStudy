import java.util.Scanner;
	/*
		System : 현재 운영체제의 콘솔
		System.out : 프로그램에서 콘솔로 데이터를 내보낼 수 있는 통로
		System.in : 콘솔에서 프로그램으로 데이터가 들어오는 통로
		
		# 스캐너 클래스의 대표적인 기능들
		
		 (1) next타입() 메소드 - nextInt(), nextDouble(), nextFloat(), ...
		 
		 	- 입력 통로로부터 다음 값 하나를 꺼내오는 기능
		 	- 문자열 형태로 값을 꺼낸 후 원하는 타입으로 변환해준다.
		 	- 입력 통로의 값들은 공백, \t, \n을 기준으로 구분할 수 있다.
		 	- 입력 통로에 꺼낼 값이 없는 경우 프로그램을 멈추고 새로운 값을 기다린다.
		 	- nextString()은 없다.
		 	
		 (2) next() 메소드
		 
		 	- 입력 통로로부터 다음 값 하나를 문자열로 꺼내는 기능
		 	- 입력 통로의 값들은 공백, \t, \n을 기준으로 구분하기 때문에 문장은 입력받을 수 없다.
		 	
		 (3) nextLine() 메소드
		 
		 	- 입력 통로로부터 다음 값 하나를 문자열로 꺼내는 기능
		 	- \n만을 기준으로 구분하기 때문에 한 줄 전체를 입력받을 수 있다.
	 */
public class B00_Scanner {

	public static void main(String[] args) {
		// 새 스캐너 생성과 동시에 어디에서 입력을 받을지 설정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력 > ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("입력하신 숫자는 " + num1 + "입니다.");
		
		System.out.print("텍스트를 입력 > ");
		String text = sc.next();
		System.out.printf("입력하신 텍스트는 \"%s\"입니다.\n", text);
		
		// nextInt()을 쓰고 난 후 남아있는 \n이 문제가 된다면 nextLine()을 사용해 \n을 비워버릴 수 있다.
		String trash = sc.nextLine();
		System.out.println("nextInt() 쓰고 난 후 남은 찌꺼기: " + trash);
		
		System.out.print("텍스트를 입력 > ");
		String sentense = sc.nextLine();
		System.out.printf("입력하신 텍스트는 \"%s\"입니다.\n", sentense);
	}
	
}
