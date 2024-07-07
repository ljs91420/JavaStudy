package myobj;

public class Pirate {
	
	int[] loses = new int[4];
	Player player = new Player();
	
	public Pirate() {
		
	}
	
	public int[] getLosePoints() {
		for (int i = 0; i < loses.length; ++i) {
			loses[i] = (int)(Math.random() * 20) + 1;
			
			for (int j = 0; j < i; ++j) {
				if (loses[j] == loses[i]) {
					--i;
					break;
				}
			}
		}
		
		return loses;
	}
	
	
}
