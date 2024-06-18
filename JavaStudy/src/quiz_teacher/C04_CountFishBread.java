package quiz_teacher;

import java.util.Arrays;

import myobj.FBread;

public class C04_CountFishBread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FBread[] breads = new FBread[100];
		
		for (int i = 0; i < 100; ++i) {
			breads[i] = new FBread();
		}
		
		// 붕어빵 맛 개수 세기
		int[] flavorCount = new int[FBread.KIND_OF_FLAVORS];
		
		for (int i = 0; i < breads.length; ++i) {
			++flavorCount[breads[i].flavor];
		}
		
		System.out.println(Arrays.toString(flavorCount));
		System.out.println("총 가격: " + FBread.getTotalPrice(breads));
	}

}
