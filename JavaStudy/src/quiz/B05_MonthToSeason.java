package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		String monthName;
		String season;
		
		System.out.print("해당 월의 숫자 입력: ");
		month = sc.nextInt();
		
		switch (month) {
			case 12:
			case 1:
			case 2:
				season = "겨울";
				break;
			case 3:
			case 4:
			case 5:
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			default:
				season = "없는 계절";
				break;
		}
		
		System.out.printf("%s\n", season);
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
		
		System.out.print("해당 월을 영어로 입력: ");
		monthName = sc.next();
		
		// engMonth = engMonth.toLowerCase();
		
		switch (monthName.toLowerCase()) {
			case "Dec":
			case "Jan":
			case "Feb":
				System.out.println("Winter");
				break;
			case "Mar":
			case "Apr":
			case "May":
				System.out.println("Spring");
				break;
			case "Jun":
			case "Jul":
			case "Aug":
				System.out.println("Summer");
				break;
			case "Sep":
			case "Oct":
			case "Nov":
				System.out.println("Fall");
				break;
			default:
				System.out.println("Invalid Month");
				break;
		}
		
		if (monthName.equalsIgnoreCase("Dec") || monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb")) {
			System.out.println("Winter");
		}
		else if (monthName.equalsIgnoreCase("Mar") || monthName.equalsIgnoreCase("Apr") || monthName.equalsIgnoreCase("May")) {
			System.out.println("Spring");
		}
		else if (monthName.equalsIgnoreCase("Jun") || monthName.equalsIgnoreCase("Jul") || monthName.equalsIgnoreCase("Aug")) {
			System.out.println("Summer");
		}
		else if (monthName.equalsIgnoreCase("Sep") || monthName.equalsIgnoreCase("Oct") || monthName.equalsIgnoreCase("Nov")) {
			System.out.println("Fall");
		}
		else {
			System.out.println("Invalid Month");
		}
	}

}
