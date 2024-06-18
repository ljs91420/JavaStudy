package myobj;

public class FBread {
	// 붕어빵을 많이 찍어내더라도 일정해야 하는 값
	final static String[] FLAVOR_NAMES = {"팥", "슈크림", "민트초코"};
	final static int[] DEFAULT_PRICES = {800, 1000, 1200};
	final static String[] QUALITY_NAMES = {"잘익음", "보통", "덜익음"};
	final static int[] QUALITY_PRICES = {100, 0, -100};
	
	public final static int KIND_OF_FLAVORS = FLAVOR_NAMES.length;
	
	public int flavor;
	public int quality;
	
	public FBread() {
		flavor = (int)(Math.random() * FLAVOR_NAMES.length);
		quality = (int)(Math.random() * QUALITY_NAMES.length);
	}
	
	public int getPrice() {
		return DEFAULT_PRICES[flavor] + QUALITY_PRICES[quality];
	}
	
	// 붕어빵 관련 함수이므로 붕어빵 클래스 내부에 배치하면 나중에 찾기 편하다.
	public static int getTotalPrice(FBread[] breads) {
		int sum = 0;
		for (int i = 0; i < breads.length; ++i) {
			sum += breads[i].getPrice();
		}
		return sum;
	}
}
