
public class A01_Escape {

	public static void main(String[] args) {
		// \t : Tab
		System.out.println("어서	오세요!	환영합니다!!");
		System.out.println("어서\t오세요!\t환영합니다!!");
		System.out.println("이름\t전화번호\t\t나이\t직급");
		System.out.println("이재상\t010-5321-3382\t34\t사원");
		
		// \\
		System.out.println("C:\\Program Files\\Java"); // C:\Program Files\Java
		
		// \"
		System.out.println("그러자 그가 말했습니다. \"나는 못해요.\""); // 그러자 그가 말했습니다. "나는 못해요."
		
		// \'
		System.out.println("오늘 저녁으로는 '치킨'을 먹어야겠다."); // 오늘 저녁으로는 '치킨'을 먹어야겠다.
		System.out.println("오늘 저녁으로는 \'치킨\'을 먹어야겠다."); // 오늘 저녁으로는 '치킨'을 먹어야겠다.
		
		// 이스케이프 문자는 두 문자가 합쳐서 하나이기 때문에 ''로 사용할 수 있다.
		System.out.println('\''); // '
		System.out.println('\n');
		System.out.println('\t');
		System.out.println(' ');
		System.out.println('\"'); // "
	}

}
