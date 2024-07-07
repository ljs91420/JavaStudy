package myobj;

public class FishBread {
	static int redBeanPrice = 800;
	static int custardCreamPrice = 1000;
	static int mintChocoPrice = 1200;
	
	String taste;
	int price;
	char quality;
	
	public FishBread() {
		int randomTaste = (int)(Math.random() * 3);
		
		switch (randomTaste) {
			case 0:
				taste = "redBean";
				break;
			case 1:
				taste = "custardCream";
				break;
			case 2:
				taste = "mintChoco";
				break;
		}
		
		int randomQuality = (int)(Math.random() * 3);
		
		switch (randomQuality) {
			case 0:
				quality = '상';
				price += 100;
				break;
			case 1:
				quality = '중';
				break;
			case 2:
				quality = '하';
				price -= 100;
				break;
		}
	}
}
