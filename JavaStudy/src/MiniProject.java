import java.util.Random;
import java.util.Scanner;

public class MiniProject {

	public static void caladd() {
		int num1, num2, opt;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력1: ");
		num1 = sc.nextInt();
		System.out.print("두 수 입력2: ");
		num2 = sc.nextInt();
		System.out.print("사칙연산 선택:1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지값=");
		opt = sc.nextInt();
		if(opt == 1)
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		if(opt == 2)
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		if(opt == 3)
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		if(opt == 4)
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		if(opt == 5)
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
	}
	public static void swap(int A, int B) {
		int temp;
		temp = A;
		A = B;
		B = temp;
		System.out.println("A = " + A + " " + "B = " + B);
	}
	public static int showMenu() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("=======메뉴=======");
		System.out.println("1.사칙연산");
		System.out.println("2.스왑하기");
		System.out.println("3.로또 프로그램");
		System.out.println("4.삼각형 출력하기");
		System.out.println("5.3의배수 5의배수 합 구하기");
		System.out.println("6.도둑잡기 게임");
		System.out.println("7.가위바위보 게임");
		System.out.println("8.절댓값 구하기");
		System.out.println("9.업앤다운 게임");
		System.out.println("10.프로그램 종료");
		System.out.print("선택: ");
		number = sc.nextInt();
		return number;
	}
	public static void lotto() {
		Random rnd = new Random();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print((rnd.nextInt(45) + 1) + " ");
			}
			System.out.println();
		}
	}
	public static int star(int number) {
		if(number == 1) {
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if(number == 2) {
			for(int i = 0; i < 5; i++) {
				for(int j = 5; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if(number == 3) {
			int cnt = 1;
			for(int i = 0; i < 5; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print((cnt++) + " ");
				}
				System.out.println();
			}
		}
		if(number == 4) {
			int cnt = 1;
			for(int i = 0; i < 5; i++) {
				for(int j = 5; j > i; j--) {
					System.out.print((cnt++) + " ");
				}
				System.out.println();
			}
		}
		return 0; // 메소드 종료
	}
	public static void basu() {
		int num1, num2, sum3 = 0, sum5 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력1: ");
		num1 = sc.nextInt();
		System.out.print("두 수 입력2: ");
		num2 = sc.nextInt();
		for(int i = num1; i <= num2; i++) {
			if(i % 3 == 0)
				sum3 += i;
			if(i % 5 == 0)
				sum5 += i;
		}
		System.out.println("3의 배수의 합: " + sum3);
		System.out.println("5의 배수의 합: " + sum5);
	}
	public static void doduk() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int usr1, usr2, usr3, usr4, number;
		usr1 = rnd.nextInt(2);
		usr2 = rnd.nextInt(2);
		usr3 = rnd.nextInt(2);
		usr4 = rnd.nextInt(2);
		while(true) {
			System.out.print("도둑 몇번째? ");
			number = sc.nextInt();
			if((usr1 == 1) && (number == 1)) {
				System.out.println("도둑 잡았다!");
				break;
			}
			if((usr2 == 1) && (number == 2)) {
				System.out.println("도둑 잡았다!");
				break;
			}
			if((usr3 == 1) && (number == 3)) {
				System.out.println("도둑 잡았다!");
				break;
			}
			if((usr4 == 1) && (number == 4)) {
				System.out.println("도둑 잡았다!");
				break;
			}
		}
	}
	public static int abs(int input1) {
		return (input1 >= 0) ? input1 : (-input1);
	}
	public static void UpandDown() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int com = rnd.nextInt(100) + 1;
		int usr;
		while(true) {
			System.out.print("숫자입력: ");
			usr = sc.nextInt();
			if(usr > com)
				System.out.println("다운");
			if(usr < com)
				System.out.println("업");
			if(usr == com) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}
	public static void Kawi() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int com, user, cnt = 1;
		while(true) {
			com = rnd.nextInt(3) + 1;
			System.out.print("입력:1.가위2.바위3.보 ");
			user = sc.nextInt();
			if(com == 1) {	// 가위
				if(user == 1) {
					System.out.println("비겼다");
				}
				if(user == 2) {
					System.out.println("이겼다");
					break;
				}
				if(user == 3) {
					System.out.println("졌다");
				}
			}
			if(com == 2) {	// 바위
				if(user == 1) {
					System.out.println("졌다");
				}
				if(user == 2) {
					System.out.println("비겼다");
				}
				if(user == 3) {
					System.out.println("이겼다");
					break;
				}
			}
			if(com == 3) {	// 보
				if(user == 1) {
					System.out.println("이겼다");
					break;
				}
				if(user == 2) {
					System.out.println("졌다");
				}
				if(user == 3) {
					System.out.println("비겼다");
				}
			}
			cnt++;
		}
		System.out.println(cnt + "번 만에 이김");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu, A = 25, B = 30, select, input1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu = showMenu();
			if(menu == 10) {
				System.out.println("프로그램 종료");
				break;
			}
			switch(menu) {
			case 1:
				caladd();
				break;
			case 2:
				System.out.println("A = " + A + " " + "B = " + B);
				swap(A, B);	// 호출할 때 매개변수로 전달
				break;
			case 3:
				lotto();
				break;
			case 4:
				System.out.print("선택:1.삼각형 2.역삼각형 3.숫자삼각 4.숫자역삼각=>");
				select = sc.nextInt();
				star(select);
				break;
			case 5:
				basu();
				break;
			case 6:
				doduk();
				break;
			case 7:
				Kawi();
				break;
			case 8:
				System.out.print("숫자입력: ");
				input1 = sc.nextInt();
				System.out.println("절댓값: " + abs(input1));
				break;
			case 9:
				UpandDown();
				break;
			}
		}
	}

}
