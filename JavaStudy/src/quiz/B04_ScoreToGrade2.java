package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int korScore = sc.nextInt();
		System.out.print("영어 점수: ");
		int engScore = sc.nextInt();
		System.out.print("수학 점수: ");
		int mathScore = sc.nextInt();
		double totScore = korScore + engScore + mathScore;
		double avrScore = totScore / 3.0;
		
		if (avrScore >= 90) {
			System.out.println("평균점수 90점 이상 A");
		} else if (avrScore >= 80) {
			System.out.println("평균점수 80점 이상 B");
		} else if (avrScore >= 70) {
			System.out.println("평균점수 70점 이상 C");
		} else if (avrScore >= 60) {
			System.out.println("평균점수 60점 이상 D");
		} else if (avrScore < 60){
			System.out.println("그 외 F");
		} else {
			System.out.println("평균점수 0점 F");
		}
	}

}
