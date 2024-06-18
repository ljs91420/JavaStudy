package myobj;

public class SoccerBall {
	static int radius = 11;
	String brand;
	int price;
	String country;
	
	static double calcOuterArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	static double calcVolume() {
		return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
	}
}
