package quiz;

public class A03_PersonalInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		// 자원 절약 여부에 따라 결정(보통은 int)
		byte age = 20;
		String telNumber = "010-1234-1234";
		// 자원 절약 여부에 따라 결정(보통은 double)
		float height = 178.5F;
		float weight = 75;
		// AB형은 char 타입에 저장할 수 없으므로 String을 써야 한다.
		String bloodType = "O";
		
		System.out.println("========== 출력 결과 ==========");
		System.out.println();
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + telNumber);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + bloodType);
	}

}
