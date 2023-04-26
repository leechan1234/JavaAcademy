package day10;

import java.util.Scanner;

/*
  Grade 클래스를 작성하세요
  3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main 메서드와
  실행예시는 아래와 같다.
  콘솔 출력예 >>
   수학, 과학 , 영어 점수를 입력하세요.
   
   수학 >> 90
   과학 >> 88
   영어>> 96
   평균은 91
 */

class Grade{
	int math;
	int sci;
	int eng;
	
	public Grade(int math, int sci, int eng) {
		this.math=math;
		this.sci=sci;
		this.eng=eng;
	}
	
	int getAvg() {
		int avg = (math + sci + eng) /3;
		return avg;
	}
	
	public void math() {
		System.out.println(math);
	}
	public void sci() {
		
		System.out.println(sci);
	}
	public void eng() {
		System.out.println(eng);
	}
	


	
}
public class Test105 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("수학,과학,영어 점수를 입력하세요");
		 System.out.println("수학 >>");
		 int math =sc.nextInt();
		 System.out.println("과학");
		 int sci = sc.nextInt();
		 System.out.println("영어 >>");
		 int eng = sc.nextInt();
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.getAvg());
				
				
	}

}
