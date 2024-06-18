
// 주석 : 프로그램에 영향을 미치지 않는 텍스트

/*
	여러 줄을
	주석 처리하고 싶을 때
*/

// Ctrl + Shift + [+, -] : 글자 크기 조절
// Ctrl + M : 현재 창 최대화
// Ctrl + W : 현재 창 닫기
// Ctrl + Shift + W : 현재 열린 모든 창 닫기

// F11 : 디버그 모드 (break point에서 정지하면서 실행)
// Ctrl + F11 : 빌드 (컴파일 + 실행)
// F2 : 에러 또는 경고가 있을 때 원인 및 해결책 말풍선 띄우기

// Command Line Interface (CLI <=> GUI)

public class A00_Hello {

	public static void main(String[] args) {
		
		System.out.println((int)'가'); // 44032번째 문자
		System.out.println((int)'韓'); // 38867번째 문자
		
		System.out.println(10 + 9); // 19
		System.out.println(10 + '9'); // 67
		
		System.out.println("총 가격 : " + 1000 * 3 + "원");
		System.out.println("총 가격 : " + (1000 + 1500) + "원");
		
		System.out.println(33333333333333L);		
		
		// 다 적고 Ctrl + F11로 실행
	}

}
