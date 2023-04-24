package day04;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// while 무한반복
		// 0 을 입력할때까지 계속 정수를 입력받아 출력하는 코드를 작성
//		 
//		while(true) {
//			System.out.println("정수입력 >>");
//			int num = scanner.nextInt();
//			System.out.println(num);
//			if(num == 0) {
//					break;
//				}
//			 
//		 }
//		System.out.println("프로그램 종료");
//		scanner.close();
		
		//문제1. 0~ 10까지 출력해보세요
//		int a = 0;
//		while(a <= 10) {
//			System.out.println(a++);
//		}
		//문제2. 1.~15까지 출력해보세요
//		int a = 1;
//		while(a <= 15) {
//			System.out.println(a++);
//		}
		//문제3. 0 ~ 100까지 10단위로만 출력해 보세요 0 10 20 30...
//		int a = 0;
//		while(a < 100) {
//			a+=10;
//			System.out.println(a);
//				}
//		
	//문제4. 1 ~ 20 까지의 홀수만 출력해보세요
//		int a = 1;
//		while(a < 20) {
//			if(a %2 == 1) {
//				System.out.println(a);
//			}
//			a++;
//		}
//		}
		//문제5. 1~10까지의 총합을 출력해 보세요
//			int a = 1;
//			int b = 0; // 누적해서 더한값을 저장할  변수 미리 만들어놓기
//			while(a <= 10) {
//				b +=a;
//				a++;
//					}
//    System.out.println(b);			
		

//문제6. 1~50까지의 짝수의 합을 출력해보세요.
//      int a = 1;
//      int b = 0; // 총합을 구해야 한다 치면 생성
//        while(a <= 50) {
//        	if(a % 2 == 0) {
//        		b +=a;
//        	}
//        	a++;
//        }
//        System.out.println(b);
        /*
        문제7. 주문 프로그램
          ## 더조은 카페 ##
      			1.아메리카노 2500 원
      	    2. 카페라떼 : 3000원
      		  3.카푸치노 : 3500원
      		  4.카라멜 마끼아또 : 4000원
      			5.샌드위치 : 6000원
      			6.종료

      		 2단계 : int money =20000; 내돈에서 주문금액 차감, 돈이 부족하면 주문 못하게,
      						총액 출력시 잔액도 출력해주세요

      */
        
        System.out.println("주문 프로그램\n"
        		+ "## 더조은 카페 ##\n"
        		+ " 1.아메리카노 2500 원\n"
        		+ "  2. 카페라떼 : 3000원\n"
        		+ "         3.카푸치노 : 3500원\n"
        		+ "         4.카라멜 마끼아또 : 4000원\n"
        		+ "      	5.샌드위치 : 6000원\n"
        		+ "      	6.종료");
        // 1단계 : 메뉴 번호로 주문을 원하는 만큼 받고 종료를 선택하면 받은 주문들의 총금액을 출력하세요.
        // 원하는 만큼 입력받기 - 입력받기를 반복  횟수는 모르겠다, 정해지지않음 - while(true)
        // 종료 시점이 필요 - 6번 눌렀을때 break;
        // 총금액 출력 - 주문 누를때마다 번호에 맞는 가격을 어딘가에 저장해놔야겠다. - 종료시 출력
        // - 누적해서 가지고 있을 변수가 하나 필요
//        int total = 0;
//		   	while(true) {
//		   		
//		   		//무한반복하는 영역
//		   	 int num = scanner.nextInt();
//		   	 
//		   	 if(num ==1) {
//		   		 System.out.println("1번 아메리카노를 선택 하셨습니다.");
//		   		  total += 2500;
//		   	 }else if(num ==2){
//		   		 System.out.println("2번 카페라떼를 선택 하셨습니다");
//		   		 total += 3000;
//		   	 }else if(num ==3) {
//		   		 System.out.println("3번 카푸치노를 선택 하셨습니다");
//		   		 total += 3500;
//		   	 }else if(num ==4) {
//		   		 System.out.println("4번");
//		   		 total += 4000;
//		   	 }else if(num ==5) {
//		   		 System.out.println("5번");
//		   		 total +=6000;
//		   	 }else if(num ==6) { // 종료시점
//		   		 System.out.println("6번");
//		   		 break;
//		   	 }
//		   	}
//		   	System.out.println("주문하신 총 금액은" + total  + " 원 입니다.");
		   	
		   	//	 2단계 : int money =20000; 내돈에서 주문금액 차감, 돈이 부족하면 주문 못하게,
			//	총액 출력시 잔액도 출력해주세요.
		   	int money = 20000;
		    int total = 0;
		   	while(true) {
		   		
		   		//무한반복하는 영역
		   	 int num = scanner.nextInt();
		   	 
		   	 if(num ==1) {
		   		 System.out.println("1번 아메리카노를 선택 하셨습니다.");
		   		  total += 2500;
		   	 }else if(num ==2){
		   		 System.out.println("2번 카페라떼를 선택 하셨습니다");
		   		 total += 3000;
		   	 }else if(num ==3) {
		   		 System.out.println("3번 카푸치노를 선택 하셨습니다");
		   		 total += 3500;
		   	 }else if(num ==4) {
		   		 System.out.println("4번");
		   		 total += 4000;
		   	 }else if(num ==5) {
		   		 System.out.println("5번");
		   		 total +=6000;
		   	 }else if(num ==6) { // 종료시점
		   		 System.out.println("6번");
		   		 break;
		   	 }
		   	}
		   	System.out.println("주문하신 총 금액은" + total  + " 원 입니다.");
		   	
		   	}
	}
		
		
		
		
		

