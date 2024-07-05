package quiz;

import java.util.Random;

public class A02_SwapValue {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int a = rnd.nextInt(30);
		int b = rnd.nextInt(30);
		int tmp;
		
		System.out.println("a에 원래 보관된 값: " + a); // a에 원래 보관된 값: 19
		System.out.println("b에 원래 보관된 값: " + b); // b에 원래 보관된 값: 22
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("교환 후 a에 보관된 값: " + a); // 교환 후 a에 보관된 값: 22
		System.out.println("교환 후 b에 보관된 값: " + b); // 교환 후 b에 보관된 값: 19
	}

}
