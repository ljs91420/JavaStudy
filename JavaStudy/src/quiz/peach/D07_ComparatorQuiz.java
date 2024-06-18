package quiz.peach;

import java.util.Comparator;

public class D07_ComparatorQuiz {
	
}

class Peach implements Comparable<Peach> {
	int price;
	String grade;
	double weight;
	String farmName;
	
	@Override
	public int compareTo(Peach p) {
		if (this.weight == p.weight) {
			return 0;
		} else if (this.weight > p.weight) {
			return 1;
		} else {
			return -1;
		}
	}
}

class 복숭아분류기_등급및가격내림차순 implements Comparator<Peach> {
	@Override
	public int compare(Peach p1, Peach p2) {
		return 0;
	}
}

class 복숭아분류기_농장이름오름차순등급기준내림차순 implements Comparator<Peach> {
	@Override
	public int compare(Peach p1, Peach p2) {
		return 0;
	}
}