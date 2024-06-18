package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ctrl + Shift + O : import
		Scanner sc = new Scanner(System.in); 
		
		int kor, eng, math;
		
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		
		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
			System.out.println("평균점수 0점 F");
		} else {
			double avg = (kor + eng + math) / 3.0;
			char grade;
			
			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 80) {
				grade = 'C';
			} else if (avg >= 80) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			System.out.printf("평균점수는 %f점이고 등급은 %c\n", avg, grade);
		}
	}
	
}
