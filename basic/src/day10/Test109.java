package day10;

import java.util.Scanner;

/*
하루 할일을 표현하는 클래스 Day는 아래와 같다. (변경X, 그대로 사용) 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요. 
//MonthSchedule 만들기 
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
실행 예시처럼 입력,보기,끝내기등 3개의 기능을 작성하세요. 
(생성자, input(), view(), finish(), run() 메서드 만들기) 
- 콘솔 실행예시 :
	이번달 스케쥴 관리 프로그램. 
	할일(입력:1, 보기:2, 끝내기:3) >>  1
	날짜(1~30) >>  1 
	할일 >>  자바공부 
	
	할일(입력:1, 보기:2, 끝내기:3) >>  1
	날짜(1~30) >>  3 
	할일 >>  영화보기
	
	할일(입력:1, 보기:2, 끝내기:3) >>  2
	날짜(1~30) >>  1 
	1일의 할 일은 자바공부입니다.
	
	할일(입력:1, 보기:2, 끝내기:3) >>  3
	프로그램 종료. 
*/

class Day {
	private String work; 
	public void setWork(String work) { this.work = work; }
	public String getWord() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다");
		else System.out.println(work + "입니다.");
	}
}
class MonthSchedule {
	Day[] days;
	MonthSchedule(int n){
		//초기세팅
		days = new Day[n]; // 30개 빈방 만들기
		for(int i = 0 ; i < n; i++) {
			days[i] = new Day();// 각 방안에 Day 객체 만들어 저장 
		}
	}
	void input() {
		System.out.println("날짜 (1~ " + dayNum);
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		//전체 프로그램 진행
		System.out.println("이번달 스케쥴 관리 프로그램.");
		/*
		  할일(입력 : 1, 보기:2 , 끝내기 : 3) >> 1
		  날짜(1~30) >> 1
		  할일 >> 자바공부
		 */
		
		while(true) {
			System.out.println("할일(입력 : 1, 보기 : 2 , 끝내기 : 3 >>");
			int sel = sc.nextInt();
		}
	}
	
}
public class Test109 {

	public static void main(String[] args) {
		
		// 4월 한달의 스케쥴
				MonthSchedule april = new MonthSchedule(30); // 4월은 30일
				april.run(); 

	}

}
