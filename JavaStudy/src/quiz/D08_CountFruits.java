package quiz;

public class D08_CountFruits {

	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주세요.
	
	final public static String[] FRUITS = {"Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple",
			"Peach", "Watermelon", "Grape"};
	
	static String[] fruits = new String[1000];
	
	public static void main(String[] args) {
		String[] fruitCount = new String[FRUITS.length];
		
		for (int i = 0; i < fruits.length; ++i) {
			fruits[i] = FRUITS[(int)(Math.random() * FRUITS.length)];
		}
		
	}
	
	int countFruits(String fruit) {
		int count = 0;
		
		for (int i = 0; i < fruits.length; ++i) {
			if (fruits[i].equals(fruit)) {
				++count;
			}
		}
		
		return count;
	}
}
