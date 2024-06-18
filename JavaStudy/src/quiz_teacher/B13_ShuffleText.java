package quiz_teacher;

import java.util.Scanner;

public class B13_ShuffleText {

	/*
		1. 문장을 입력받으면 공백을 제거한 배열로 만들고 싶다.
		
			(1) 배열을 만들기 위해서는 정확한 배열의 크기를 알아야 한다.
			(2) 입력받은 문장에서 공백이 아닌 문자의 개수를 알아야 배열의 크기를 설정할 수 있다.
			(3) 문자열에 들어있는 공백이 아닌 문자들을 배열로 옮겨담는다.
			
		2. 완성된 배열을 랜덤으로 섞어준다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String text, blankRemoved = "";
		char[] arr;
		int randomIndex;
		char tmp;
		
		System.out.print("문장 입력: ");
		text = sc.nextLine();
		
		for (int i = 0; i < text.length(); ++i) {
			if (text.charAt(i) != ' ') {
				blankRemoved += text.charAt(i);
			}
		}
		
		arr = new char[blankRemoved.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = blankRemoved.charAt(i);
		}
		
		// 1000은 임의의 숫자
		for (int i = 0; i < 1000; ++i) {
			randomIndex = (int)(Math.random() * (arr.length - 1)) + 1;
			
			tmp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = tmp;
		}
		System.out.println(arr);
	}

}
