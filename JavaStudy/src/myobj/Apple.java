package myobj;

public class Apple {

	int price = 500;
	double weight = 3;
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격이 1000, 무게가 5가 된다.
	public Apple() {
		// TODO Auto-generated constructor stub
		
		price = 1000;
		weight = 5;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격은 받은 걸로 채우고 무게는 10으로 설정하겠다.
	public Apple(int price) {
		// TODO Auto-generated constructor stub
		
		this.price = price;
		weight = 10;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격은 1500원, 무게는 받은 걸로 설정하겠다.
	public Apple(double weight) {
		// TODO Auto-generated constructor stub
		
		price = 1500;
		this.weight = weight;
	}
	
	// 이 생성자를 통해 만들어지는 인스턴스들은 두 변수의 값을 직접 설정하겠다.
	public Apple(int price, double weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("사과" + this + "의 가격: " + price);
		System.out.println("사과" + this + "의 무게: " + weight);
	}
}
