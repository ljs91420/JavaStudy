// Ctrl + M : 현재 창 최대화
// Ctrl + W : 현재 창 닫기
// Ctrl + Shift + W : 현재 열린 모든 창 닫기
// F11 : 디버그 모드 (break point에서 정지하면서 실행)
// Ctrl + F11 : 빌드 (컴파일 + 실행)
// Ctrl + A : 전체 선택
// Ctrl + Shift + F : 자동 맞춤
// 빨간 밑줄 클릭하고 F2 : 오류의 원인 및 해결책 제시
// 함수 클릭하고 F3 : 함수 설명
// Command Line Interface (CLI <=> GUI)

public class A00_Hello {

	public static void main(String[] args) {
		System.out.println((int)'가'); // 44032번째 문자
		System.out.println((int)'韓'); // 38867번째 문자

		System.out.println(10 + 9); // 19
		System.out.println(10 + '9'); // 67

		System.out.println("총 가격 : " + 1000 * 3 + "원"); // 총 가격 : 3000원
		System.out.println("총 가격 : " + (1000 + 1500) + "원"); // 총 가격 : 2500원

		System.out.println(33333333333333L); // 33333333333333

		// Ctrl + F11로 실행
	}

}