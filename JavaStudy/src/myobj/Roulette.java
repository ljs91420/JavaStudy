package myobj;

public class Roulette {
	
	String[] prize;
	static double probability = 100;
	
	void add(String prize, int qty) {
		probability /= (double)prize.length();
	}
}
