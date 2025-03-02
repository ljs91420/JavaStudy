
public class C14_InstanceLifecycle {
	
	int[] arr = new int[10];
	
	static {
		// 스태틱 블록
		System.out.println("스태틱 블록1 실행됨..."); // 스태틱 블록1 실행됨...
		
		// arr[0] = 10; // 불가능
	}
	
	static {
		// 스태틱 블록
		System.out.println("스태틱 블록2 실행됨..."); // 스태틱 블록2 실행됨...
	}
	
	{
		// 인스턴스 블록
		System.out.println("인스턴스 블록1 실행됨..."); // 인스턴스 블록1 실행됨...
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = i * 10;
		}
	}
	
	{
		// 인스턴스 블록
		System.out.println("인스턴스 블록2 실행됨..."); // 인스턴스 블록2 실행됨...
	}
	
	public C14_InstanceLifecycle() {
		// 생성자
		System.out.println("생성자 실행됨"); // 생성자 실행됨
	}
	
	public static void main(String[] args) {
		new C14_InstanceLifecycle();
	}
}
