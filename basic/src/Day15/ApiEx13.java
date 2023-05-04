package Day15;

import java.util.Calendar;

public class ApiEx13 {

	public static void main(String[] args) {
			
		//객체생성불가
//		Calendar now = new Calendar();
		Calendar now = Calendar.getInstance(); // 현재시간담아서
		System.out.println(now);
		
		int year=now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1; //MONTH : 0 ~ 11월
		int date = now.get(Calendar.DATE);
		System.out.println(year + "/" + month + " / " + date );
		
		// 요일 : 일 = 1, 월 = 2.... 토 = 7
	int yoil =	now.get(Calendar.DAY_OF_WEEK);
		System.out.println(yoil);
	}

}
