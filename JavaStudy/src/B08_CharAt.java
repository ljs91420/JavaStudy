
public class B08_CharAt {

	/*
		# "문자열".charAt(index);
		
			- 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내오는 함수
			- 시작 인덱스 : 0
			- 마지막 인덱스 : 문자열의 길이 - 1
			
		# "문자열".length();
		
			- 해당 문자열의 길이
	 */
	
	public static void main(String[] args) {
		String str = "가나다라";
		
		char ch = str.charAt(3);
		// ch = str.charAt(4); // 에러
		
		System.out.println(str.charAt(0)); // 가
		System.out.println(str.charAt(1)); // 나
		System.out.println(ch); // 라
		System.out.println("ABCDEFGH".charAt(5)); // F
		
		String str2 = "I have a delicious apple";
		
		System.out.println(str2.length()); // 24
		System.out.println("마지막 글자: " + str2.charAt(str2.length() - 1)); // 마지막 글자: e
		
		for (int i = 0; i < str2.length(); ++i) {
			System.out.println(str2.charAt(i));
		}
	}

}
