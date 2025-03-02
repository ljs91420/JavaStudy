import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D09_String {
	public static void main(String[] args) {
		String fruits = "apple/banana/orange/kiwi";
		
		// "".split() : 문자열을 원하는 문자를 기준으로 자른 배열을 반환
		String[] fruitArr = fruits.split("/");
		
		System.out.println(Arrays.toString(fruitArr)); // [apple, banana, orange, kiwi]
		for (String fruit : fruitArr) {
			System.out.println(fruit);
		}
		
		// String.join(delim, iterable) : iterable(하나씩 꺼낼 수 있는)객체를 원하는 기준으로 모두 이어붙인 하나의 문자열을 생성한다.
		List<String> zoo = new ArrayList<>();
		
		zoo.add("코끼리");
		zoo.add("사자");
		zoo.add("호랑이");
		
		String result = String.join("#", zoo);
		System.out.println(result); // 코끼리#사자#호랑이
		result = String.join("###", fruits);
		System.out.println(result); // apple/banana/orange/kiwi
		
		// "".charAt(index) : 원하는 위치의 문자 하나를 반환받는다.
		// (String은 문자 하나만 꺼내는 것은 가능하지만, 문자를 수정하는 것은 불가능하다.)
		System.out.println("ABC".charAt(0)); // A
		
		// "".contains(str) : 원하는 문자열이 포함되어있는지 체크한다.
		System.out.println("Pineapple".contains("apple")); // true
		
		// "".startsWith(str) : 해당 문자열이 전달한 문자열로 시작하는지 확인한다.
		String url = "http://naver.com";
		System.out.println(url.startsWith("https://")); // false
		
		// "".endsWith(str) : 해당 문자열이 전달한 문자열로 끝나는지 확인한다.
		String path = "C:\\Program files\\Java\\tiger.jpg";
		System.out.println(path.endsWith(".jpg")); // true
		System.out.println(path.endsWith(".gif")); // false
		
		// "".replace(old, new) : 해당 문자열의 일부를 교체한다.
		String email = "abc123@naver.com";
		String gmail = email.replace("naver", "gmail");
		String microsoft = email.replace("naver", "microsoft");
		
		System.out.println(gmail); // abc123@gmail.com
		System.out.println(microsoft); // abc123@microsoft.com
		
		// "".substring(start) : 해당 문자열을 원하는 위치부터 자른 인스턴스를 반환
		String alphabet = "abcdefghijklmnop";
		System.out.println(alphabet.substring(5)); // fghijklmnop
		
		// "".substring(start, end) : 해당 문자열을 start 이상 end 미만으로 자른 인스턴스를 반환
		System.out.println(alphabet.substring(0, 8)); // abcdefgh
		System.out.println(alphabet.substring(3, 6)); // def
		System.out.println(alphabet.substring(0, 10)); // abcdefghij
		System.out.println(alphabet.substring(10)); // klmnop
		
		// "".trim() : 문자열 외곽의 공백을 제거한 인스턴스를 반환한다.
		String answer = "사과";
		String userInput = " 사과";
		String userInput2 = " 사 과 ";
		
		// trim()은 내부의 공백까지 제거해주지는 않는다.
		System.out.println(userInput2); //  사 과 
		System.out.println(userInput2.trim()); // 사 과
		
		// replace()를 활용해서 내부의 공백까지 제거할 수 있다.
		System.out.println(userInput2.replace(" ", "")); // 사과
		
		System.out.println(answer.equals(userInput)); // false
		System.out.println(answer.equals(userInput.trim())); // true
		
		// "".toUpperCase() : 해당 문자열을 모두 대문자로 변환한 새 인스턴스를 반환
		// "".toLowerCase() : 해당 문자열을 모두 소문자로 변환한 새 인스턴스를 반환
		String cmd = "quit";
		String userCmd = "Quit";
		
		System.out.println(cmd.equals(userCmd)); // false
		System.out.println(cmd.equals(userCmd.toLowerCase())); // true
		
		// "".indexOf(str) : 해당 문자열에서 전달한 문자열을 찾아서 해당 위치를 반환
		String text = "I like apple and applepie";
		
		System.out.println(text.indexOf("apple")); // 7
		
		// "".indexOf(str, start) : 문자열을 어디서부터 찾기 시작할건지 결정할 수 있다.
		System.out.println(text.indexOf("apple", 10)); // 17
		
		// 연습 : 반복문을 활용하여 위의 text에서 모든 "ap"의 위치를 찾아 콘솔에 출력해보세요.
//		for (int i = 0; i < text.length(); ++i) {
//			int index = text.indexOf("ap", i);
//			
//			if (index != -1) {
//				System.out.println(index);
//			}
//		}
		
//		int found = -1;
//		while (true) {
//			found = text.indexOf("ap", found + 1);
//			if (found == -1) {
//				break;
//			}
//			System.out.println("찾은 곳: " + found);
//		}
		
		int found = -1;
		while ((found = text.indexOf("ap", found + 1)) != -1) {
			System.out.println("찾은 곳: " + found);
		}
		
		// "".lastIndexOf(str) : 원하는 문자열을 뒤에서부터 찾아준다.
		System.out.println(text.lastIndexOf("ap")); // 17
		
		// "".lastIndexOf(str, start) : 원하는 지점부터 찾기 시작할 수 있다.
		System.out.println(text.lastIndexOf("ap", 17)); // 17
		
		// toString()
		
		// String.format(fmt, values...) : 
		String timeStr = String.format("%02d:%02d:%02d", 7, 15, 35);
		System.out.println(timeStr); // 07:15:35
		
		// String.valueOf(value) : 해당 값을 문자열로 변환한 인스턴스를 반환한다.
		String value1 = "" + 12345;
		String value2 = String.valueOf(12345);
		
		System.out.println(value1 + value2); // 1234512345
		System.out.println(value1 == value2); // false
		System.out.println(value1.equals(value2)); // true
	}
}
