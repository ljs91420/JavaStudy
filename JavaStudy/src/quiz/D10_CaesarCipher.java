package quiz;

public class D10_CaesarCipher {

	/*
		# 시저(카이사르) 암호
		
			- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는 암호 알고리즘
			
			  [암호표]
			  
			  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\;:'"/?<>,.
			  
			  * 암호화
			  
			    (평문)        key:3       (암호문)
			    HELLO!    ---------->    KHOOR$
			    
			  * 복호화
			                 key:3       
			    HELLO!    <----------    KHOOR$
	 */
	
	// 1. 평문과 키값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	
	// 2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	
	// ※ 사용할 수 있는 문자의 종류 : 영어 대문자, 영어 소문자, 숫자, 특수문자
	
	public static void main(String[] args) {
		System.out.println(encrypt("HELLO!", 3));
		System.out.println(decrypt("KHOOR$", 3));
	}
	
	static String encrypt(String plaintext, int key) {
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
		
		StringBuilder plaintext2 = new StringBuilder(plaintext);
		
		for (int i = 0; i < plaintext2.length(); ++i) {
			char ch = plaintext2.charAt(i);
			String chStr = String.valueOf(ch);
			int index = text.indexOf(chStr);
			
			plaintext2.setCharAt(i, text.charAt(index + key));
		}
		
		return String.valueOf(plaintext2);
	}
	
	static String decrypt(String ciphertext, int key) {
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
		
		StringBuilder ciphertext2 = new StringBuilder(ciphertext);
		
		for (int i = 0; i < ciphertext2.length(); ++i) {
			char ch = ciphertext2.charAt(i);
			String chStr = String.valueOf(ch);
			int index = text.indexOf(chStr);
			
			ciphertext2.setCharAt(i, text.charAt(index - key));
		}
		
		return String.valueOf(ciphertext2);
	}
}
