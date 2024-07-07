package quiz_teacher;

public class D10_CeasarCipher {	
	String cryptSet;
	
	public D10_CeasarCipher() {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	}
	
	public D10_CeasarCipher(String cryptSet) {
		this.cryptSet = cryptSet;
	}
	
	String encrypt(String plain, int key) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < plain.length(); ++i) {
			// 문자를 하나씩 꺼낸다.
			char ch = plain.charAt(i);
			// 암호표에서 해당 문자의 위치를 찾는다.
			int index = cryptSet.indexOf(ch);
			// 만약 -1이 나왔다면 암호표에 존재하지 않는 문자이므로 그대로 유지
			// 인덱스가 -1이 아니라면 암호표에서 키값만큼 더한 문자를 가져와서 추가
			if (index != -1) {
				result.append(cryptSet.charAt((index + key) % cryptSet.length()));
			} else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	
	String decrypt(String crypto, int key) {
		StringBuilder result = new StringBuilder();
		
		// 어차피 키값이 너무 커봤자 의미가 없는 알고리즘이기 때문에 사이즈를 줄일 수 있다.		
		for (int i = 0; i < crypto.length(); ++i) {
			char ch = crypto.charAt(i);
			int index = cryptSet.indexOf(ch);
			if (index != -1) {
				// key값으로 뺐는데 결과가 음수인 경우와 양수인 경우를 처리한다.
				int target = index - (key % cryptSet.length());
				
				if (target < 0) {
					result.append(cryptSet.charAt(cryptSet.length() + target));
				} else {
					result.append(cryptSet.charAt(target));
				}
			} else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		D10_CeasarCipher cipher1 = new D10_CeasarCipher();
		
		int key = 10;
		
		String encrypted = cipher1.encrypt("한글, abc, 123.", key);
		System.out.println("암호화 결과: " + encrypted); // 암호화 결과: 한글I"klmI"@#$J
		
		String decrypted = cipher1.decrypt(encrypted, key);
		System.out.println("복호화 결과: " + decrypted); // 한글, abc, 123.
	}
}
