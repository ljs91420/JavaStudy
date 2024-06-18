package quiz_teacher;

import java.util.Scanner;

public class B08_ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String text;
		String changed = "";
		
		System.out.print("문장 입력: ");
		text = sc.nextLine();
		
		int len = text.length();
		int diff = Math.abs('A' - 'a');
		
		for (int i = 0; i < len; ++i) {
			char ch1 = text.charAt(i);
			char ch2;
			int tmp = (int)ch1;
			
			if (ch1 >= 'A' && ch1 <= 'Z') {
				ch2 = (char)(tmp + diff);
			} else {
				ch2 = (char)(tmp - diff);
			}
			
			changed += ch2;
		}
		System.out.println(changed);
		
	}

}
