package day08;
/*
   클래스 기본형 변수 : static : 바로 사용가능 /프로그램 종료시 사라짐 : 클래스명.변수명 : 
   클래스 참조형 변수
   
   인스턴스 기본형 변수 : new로 객체생성 후 사용가능 / 가바지컬렉터에 의해 사라짐 : 참조변수명.변수명
   인스턴스 참조형 변수
   
   지역 기본형 변수 : 메서드 안에서 선언 : 변수명 : 메서드 안에서만 사용가능
   지역 참조형 변수
   
   클래스/인스턴스 변수수 자동 초기화
   지역은 자동 초기회x
 */

//}
//public class Test65 {
//	static int a;	  //클래스 기본형 변수 : 자동초기화 default 0 (int)
//	static Test65 t;  // 클래스 참조형 변수 : default null(주소가 없다)
//	static TvTest tv = new TvTest();  //클래스 참조형 변수
//	
//	int x;  //인스턴스 기본형 변수 : 0
//	TvTest tv2 = new TvTest(); //인스턴스 참조형 변수 : null
////	Test65 test = new Test65(); //인스턴스 참조형변수 : null
//	//내 클래스 타입으로 내 클래스 안에 인스턴스 변수로 객체생성 하면 안된다.
//	Test65 test; //선언만 가능
//	//main 메서드 영역
//	public static void main(String[] args) {
//		int b =100; //지역 기본형 변수
//		TvTest tv3 = new TvTest(); //지역 참조형 변수
//		
//		Test65 tt= new Test65();
//		tt.test = new Test65();
//		
		
//		
//	}
//
//}
