package quiz_teacher;

public class B12_TempPassword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./";
		String pw;
		
		for (int i = 0; i < 20; ++i) {
			pw = "";
			
			for (int keyLen = 0; keyLen < 6; ++keyLen) {
				int randomIndex = (int)(Math.random() * charset.length());
				pw += charset.charAt(randomIndex);
			}
			System.out.println(pw);
		}
		
//		for (int i = 0; i < 20; ++i) {
//			pw = "";
			
//			for (int j = 0; j < 6; ++j) {
//				int select = (int)(Math.random() * 3);
//				
//				switch (select) {
//					case 0:
//						pw += (char)(Math.random() * 26 + 'A');
//						break;
//					case 1:
//						pw += (char)(Math.random() * 26 + 'a');
//						break;
//					case 2:
//						pw += (char)(Math.random() * 25 + 33);
//						break;
//				}
//			}
//			System.out.println(pw);
//		}
	}

}
