package quiz;

import java.util.Random;

public class B12_TempPassword {

	/*
		알파벳 대문자로만 구성된 랜덤 4자리 비밀번호 20개 생성하기
	 */
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		String pw;
		
		for (int i = 0; i < 20; ++i) {
			pw = "";
			for (int j = 0; j < 4; ++j) {
				pw += (char)(rnd.nextInt(65, 91));
			}
			System.out.println(pw);
		}
	}

}
