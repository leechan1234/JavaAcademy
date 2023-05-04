package dya17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ApiEx50 {

	public static void main(String[] args) {
		// 현재 로컬 컴퓨터의 날짜와 시간을 리턴
			LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println(now);
			//원래 사용하는 년월일시분 : 월은 숫자 또는 java.time.Month의 enum으로 지정가능
			LocalDateTime christmas = LocalDateTime.of(2023, 12,25,0,0); //원래 사용하는 년월일시분
			System.out.println(christmas);
			
			//DateTimeFormatter.ofPatttern() 을 사용하면 원하는 패턴으로 변경가능

			String formattedNow=
			now.format(DateTimeFormatter.ofPattern("yyy년MM월 dd일 HH:mm:ss"));
			
			System.out.println(formattedNow);
			
			System.out.println("-------------------------");
			
			System.out.println("년 : " + now.getYear());
			System.out.println("월 : " + now.getMonthValue());
			System.out.println("일 : " + now.getDayOfMonth());
			System.out.println("요일 " +now.getHour());
			System.out.println("시간 : " + now.getHour());
	}

}
