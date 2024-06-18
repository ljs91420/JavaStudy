package myobj;

public class Baseball {
	int[] nums = new int[4];
	public int num, currIndex, len = nums.length;
	boolean isRepeated;
	
	public Baseball() {
		currIndex = 0;
		
		while (currIndex < len) {
			num = (int)(Math.random() * 10);
			
			for (int i = 0; i < currIndex; ++i) {				
				if (nums[currIndex] == num) {
					isRepeated = true;
					break;
				}
			}
			
			if (!isRepeated) {
				nums[currIndex++] = num;
			}
		}
	}
}
