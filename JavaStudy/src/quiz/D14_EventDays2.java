package quiz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class D14_EventDays2 {

	/*
		java.time 패키지의 클래스들만 활용하여	실행하면 오늘부터 앞으로 1년 간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요.
		
		1+1 이벤트 : 매월 18일
		20% 할인 이벤트 : 홀수번째 주 금요일
		구매시 아메리카노 무료 이벤트 : 매주 화요일
		
		※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다.
	 */
	
	public static void printEventDays() {
		LocalDate today = LocalDate.now();
		
		for (int i = 0; i < 365; ++i) {
			System.out.printf("[%s]의 이벤트: ", today.plusDays(i));
			
			boolean eventExist = false;
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printEventDays();
	}
}
