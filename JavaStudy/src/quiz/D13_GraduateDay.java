package quiz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class D13_GraduateDay {
	
	/*
		사용자가 수업을 시작하는 날짜와 수업을 받아야 하는 날을 입력하면
		수업이 쉬는 날을 모두 출력해주고
		수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요.
		
		쉬는 날 - 토, 일, 공휴일(대체 휴일 포함)
	 */
	
	static ArrayList<Calendar> getHolidays(int startYear, int startMonth, int startDate, int classDays) {
		ArrayList<Calendar> holidays = new ArrayList<>();
		
		
		
		return holidays;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startYear = sc.nextInt();
		int startMonth = sc.nextInt();
		int startDate = sc.nextInt();
		int classDays = sc.nextInt();
		
		System.out.println(getHolidays(2024, 4, 16, 120));
	}
}
