package day03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//문제1. 정수 두개를 입력 받고 , 몫 /과 나머지% 를 출력해보세요.
//		System.out.println("숫자 2개를 입력 하시오");
//		int user1 = scanner.nextInt();
//		int user2 = scanner.nextInt();
//		System.out.println("몫 : " + user1 / user2);
//		System.out.println("나머지 : " + user1 % user2);
//		
			    //문제2. 날찌(day)를 입력받고, 몇개월 몇일인지 출력해보세요. 단, 1달은 30일로 고정.
//		     		    int user =scanner.nextInt();
//		     		  int month = user / 30;
//		     		  int day = user % 30 ;
//		     		 
//		     		  System.out.println(month+"개월" + day+"일");
//		     		  
		     		
				//문제3. 점수 3개를 입력 받고, 총합과 평균을 출력해보세요.
//		int score1 = scanner.nextInt();
//		int score2 = scanner.nextInt();
//		int score3 = scanner.nextInt();
//		int grade = score1 +score2 +score3; 
//		System.out.println("총점 : " + grade);
//		System.out.println("점수평균 : " + (grade / 3));
//		
				
				//문제4. 숫자 하나를 입력받고, " 음수"인지 "양수"인지 출력하세요.
//		int user = scanner.nextInt();
//		if (user > 0) {
//			System.out.println(" 양수 입니다 ");
//		}else if (user < 0) {
//			System.out.println("음수 입니다");
//		}else{
//		System.out.println("0 입니다");
	
				//문제5. 199 사이의 숫자를 입력받고, "짝수"인지 "홀수:인지 출력해보세요
		//짝수 2 4 6 8 10 나머지가 0 이되면 짝수
		//홀수 1 3 5 7 9
//		int user = scanner.nextInt();
//		  if ( user%2 == 0) {
//			System.out.println("짝수 입니다");
//		}else {
//			System.out.println("홀수 입니다");
//		}
//		
				//문제6. 정수 3개를 입력받고 ,3개의 숫자중 중간 크기의 수를 출력해보세요.(평균값x)
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
	  if (a<b) {
                if(c<a) {
                	System.out.println("a : " + a);
                }else { // c > a
                	if(b<c) {
                	System.out.println("b : " + b); 
                	}else { // b > c
                		System.out.println("c : " + c);
                	}
                }
	  	}else {// a > b
		if (b > c) {
			System.out.println(" b : "  + b); 
		}else { // b < c
			if(c > a) {
				System.out.println("a :"  + a);
			}else {
				System.out.println("c : " + c);
			}
	
	
		
//		}
//	}
		
	
		
	
		     		    
		     		    /* 문제7. 2차원 평면에서 직사가형은 왼쪽 상단 모서리와 오른족 하단 모서리 두점으로 표현한다.
		     		       (100,100)과(200,200) 의 두 점으로 이루어진 사각형이 있을때,
		     		       정수 x, y 값을 입력받고,
		     		       점(x,y)가 직사각형 안에 있는지 판단하는 프로그램을 작성해보세요
		     		     */
//		System.out.println("x : " );
//		int x =scanner.nextInt();
//		System.out.println("y : ");
//		int y =scanner.nextInt();
//		if (x >= 100 && x <= 200 && y>=100 && y <= 200) {
//			System.out.println("직사각형 안에 있습니다");
//		}else {
//			System.out.println("직사각형 안에 없습니다");
//		}
		}
	  	}
	}
}

		
		
	
	



