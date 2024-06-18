package quiz;

import java.util.Arrays;

public class B13_Sort {

	/*
		1 ~ 1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후 
		해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 만들어 원본과 함께 출력해주세요.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[30];
		int[] sorted = new int[30];
		int len = nums.length, sLen = sorted.length, tmp;
		
		for (int i = 0; i < len; ++i) {
			nums[i] = (int)(Math.random() * 1000) + 1;
		}
		
		for (int i = 0; i < sLen; ++i) {
			sorted[i] = nums[i];
		}
		
		for (int i = 0; i < sLen; ++i) {
			for (int j = 0; j < i; ++j) {
				if (sorted[i] < sorted[j]) {
					tmp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(sorted));
	}

}
