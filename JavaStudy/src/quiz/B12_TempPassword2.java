package quiz;

import java.util.Random;

public class B12_TempPassword2 {

	/*
		대문자, 소문자, 특수문자, 숫자로 구성된 6자리 랜덤 비밀번호를 20개 생성하는 프로그램
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		
		String pw;
		
		for (int i = 0; i < 20; ++i) {
			pw = "";
			for (int j = 0; j < 6; ++j) {
				char ch = (char)((int)(Math.random() * 123) + 33);
				boolean isPassword = ch >= 33 && ch <= 57 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122;
				
				if (isPassword) {
					pw += ch;
				}
			}
			System.out.println(pw);
		}
	}

}
