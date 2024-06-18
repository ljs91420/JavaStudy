
public class B09_BreakContinue {

	/*
		# break
		
		# continue
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 1000; ++i) {
			System.out.println(i);
			
			if (i == 7) {
				break;
			}
		}
		System.out.println("------------------------");
		
		// Ctrl + Shift + F : 자동 맞춤
		for (int i = 0; i < 10; ++i) {
			if (i % 2 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
