package quiz;

import java.util.Scanner;

public class B13_ShuffleText {

	/*
		사용자로부터 문장을 입력받으면 해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요(문장 내에 공백이 있으면 제거할 것)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputText, outputText = "";
		int len, randomIndex;
		char ch;
		
		System.out.print("문장 입력: ");
		inputText = sc.nextLine();
		
		len = inputText.length();
		
		for (int i = 0; i < len; ++i) {
			randomIndex = (int)(Math.random() * len);
			ch = inputText.charAt(randomIndex);
			
			if (ch == ' ') {
				System.out.print("");
			} else {
				outputText += ch;
			}
		}
		System.out.println(outputText);
	}

}
