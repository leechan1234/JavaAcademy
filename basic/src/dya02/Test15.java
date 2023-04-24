package dya02;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 

	      //산술연산자 문제 
	      //문제1. 정수 2개를 입력받고, 사칙연산의 결과를 출력해보세요. 
//	 int user =scanner.nextInt();
//	 int user2 =scanner.nextInt();
//	  System.out.println(user+user2);
//	  System.out.println(user-user2);
//	  System.out.println(user*user2);
//	  System.out.println(user/user2);
//	  System.out.println(user%user2);
	  
	  
//	      문제2. 초단위로 정수를 입력받고, ?분?초 형태로 출력해보세요.  //500이면 8분20초
//	System.out.println("초를 입력 하시오");
//	 int user = scanner.nextInt();
//	 int minute = user / 60;
//	int  second = user %60 ;
//	System.out.println(minute + "분"+ second + "초");
	
//	 문제3. 초단위로 정수를 입력받고, ?시간?분?초 형태로 출력해보세요. 
//	 System.out.println("초를 입력 하시오");
//	 int user = scanner.nextInt();
//	 int hour = user /(60*60);
//	 int minute = user / 60;
//	int  second = user % 60 ;
//	System.out.println(hour+ "시간" + minute + "분"+ second + "초");
//	      문제4. 최소 화폐매수 구하기 : 금액을 입력하면 최소한의 화폐매수를 구해주는 프로그램 
//	               콘솔예) 
//	               금액입력 : 67800    (<-사용자가 금액입력) 
//	               5만원 : 1장
//	               1만원 : 1장
//	               5천원 : 1장
//	               1천원 : 2장
//	             5백원 : 1개 
//	             1백원 : 3개 
	 System.out.println("금액을 입력하시오");
	 
	 int user =scanner.nextInt();
	 int fiftyThousand = user / 50000;
	user = user % 50000;
	int tenThousand = user / 10000  ;
	user %= 10000;
	 int fiveThousand = user / 5000;
	 user %= 5000;
	 int oneHund = user / 1000;
	 user %= 1000;
	 int fiveHund = user / 500;
	 user %= 500;
	  int one = user / 100;
	  user %= 100;
	 
	 System.out.println("5만원권 : " + fiftyThousand + "장\n"
			 + "1만원권 : "+ tenThousand + "장\n"
	 		+ "5천원권 : " + fiveThousand +"장\n"
	 		+ "1천원권 : " + oneHund + "장\n"
	 		+ "5백원권 : " + fiveHund+"장\n"
	 		+ "1백원권 : " + one);
	 		

	 
//	      
	       
	      // 증감연산자 문제 
	      // 문제5. 결과를 먼저 주석으로 작성하고, 실행해서 맞는지 확인해봅시다. 
//	      int i = 5, j = 5; 
//	      System.out.println(i++);
//	      System.out.println(++j);
//	      System.out.println("i = " + i + ", j = " + j ); 
	      // 7 = " i + ",j = "+j // i : 6 j : 6
	      
//	       문제6. 결과를 먼저 주석으로 작성, 실행해서 확인 
//	      int k = 10; 
//	      System.out.println(k++); //
//	      System.out.println(++k);
//	      ++k; 
//	      System.out.println(++k);
//	      System.out.println(k++);
//	      System.out.println(k); // 15
//	      
	      // 문제7. 결과를 먼저 주석으로 작성, 실해해서 확인 
//	      int a = 10; 
//	      int b = 10; 
//	      int r = ++a + ++b; // r = 22
//	      r = ++a + b++;       // r = 23
//	      r = ++a + a;   //26
//	      r = ++a + a++; 28
//	      r = ++a + ++a; 
//	      System.out.println(r);//
	      //r =11 + 11= 22
	      //r =12 +12
	      //r= 13+ 13 + 12
	      //r =14 + 14 + 12 
	      //40
	      
	   }
	
	}


