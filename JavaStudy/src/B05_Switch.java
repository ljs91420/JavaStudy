
public class B05_Switch {

	/*
		# switch-case문
			
			- () 안에 boolean 타입 값은 사용할 수 없다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =13;
		
		switch (a) {
			case 10:
			case 13:
			case 21:
				System.out.println("Hello~!");
				// break;
			case 11:
				System.out.println("Good bye~~~");
				// break;
			default:
				System.out.println("Command Not Found...");
				// break;
		}
		
		int num = 13;
		
		switch (num % 2) {
			case 0:
				System.out.println(num + "은 짝수");
				break;
			case 1:
				System.out.println(num + "은 홀수");
				break;
			default:
				System.out.println(num + "은 음수");
				break;
		}
		
		String cmd = "dir";
		
		switch (cmd) {
			case "cd":
				System.out.println("디렉토리 변경");
				break;
			case "dir":
				System.out.println("현재 디렉토리 정보");
				break;
			default:
				System.out.println("명령어를 찾지 못함");
				break;
		}
	}

}
