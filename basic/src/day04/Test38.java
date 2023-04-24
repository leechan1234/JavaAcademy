package day04;

import java.util.Scanner;

public class Test38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			//중첩 반목
//		for (int i = 0; i <= 3; i++) {
//			for(int j = 0; j <= 3; j++ ) {
//				System.out.println(i + " " + j);
//			}
//		}
		//문제 1. 구구단 2단만 출력 
//		for(int i = 2; i <= 2; i ++) {
//			for(int j = 1; j <= 9; j++) {
//				int result =i *j;
//				System.out.println("구구단 2단 : " + i + "x" + j + " =" + result);
//			}
//		}
		//문제 2. 구구단수를 입력받아 해당 단만 출력
//		  int user = scanner.nextInt();
//		  for(int i = 1; i <= 9; i++) {
//			  System.out.println(user+" *" + i + " =" + user * i );
//		  }
//		
		//문제 3. 구구단 전체 출력 1단~9단
//		for(int i = 2; i <= 9; i++) {
//			System.out.println("**" + i+"단" +"**");
//			for(int j = 1; j <=9; j++) {
//				int result = i * j;
//				System.out.println(i + "x" + j + "=" + result);
//			}
//		}
		//문제 3 3-1 격자무늬로 출력
//		for(int i = 0; i <=7; i+=3) {
//			System.out.print("*** " + i + "단 ***\t");
//			System.out.print("*** " + (i+1) + "단 ***\t");
//			System.out.print(" ***" + (i+2) + "단 ***");
//			for(int j = 1; j <= 9; j++ ) {
//				System.out.print(i + " * " + j + "=" +(i*j) +"\t" );
//				System.out.print((i+1) + " * " + j + " = " + ((i+1)*j) + "\t");
//				System.out.println((i+2) + " * " + j + " = " + ((i+2)*j));
//			}
//		}
		
		//별문제 6번
//		int star = 1;
//		boolean flag = true; //별이 증가하는지 감소하는지 판별(증가true 감소 false;)
//		for(int i = 0; i < 9; i++) {
//			for(int j = 0; j <star; j++) {
//				System.out.print("*");
//			}
//			//별 증감 시키기
//			if(flag) {
//				star++;
//				}
//			else {
//				star--;
//				}
//			if(star == 5) { // 별 다섯개 찍었을때
//				flag = false;// false로 변경해 이제는 별이 감소되면서 반복되게
//			}
//			System.out.println();
//		}
		//문제 8. -1이 입력 될때까지 정수를 계속 입력받아
//		  총합과 평균을 출력해보세요
//		int total =0; //합계 변수 0으로 초기화
//		int count = 0;
//		while(true) {
//			System.out.println("정수입력 >>");
//		int user = scanner.nextInt();
//		if(user == -1) { // 종료시점
//			break;
//		}
//		//종료 걸리지 않으면 아래코드 실행
//		total += user;// 입력받은 수 total에 누적시키기
//		count++;
//	}
//		System.out.println("총 힙 : " + total);
//		System.out.println("평균 : " + total / count);
//		
		
//문제9 문자열을 계속 입력받아 출력하되,
//   exit를 입력받으면 종료되는 프로그램을 작성하세요.
	
//     팁 : 문자열끼리의 비교는 == 로 불가능
//    String의 기능중.equils() 메서드를 이용 해야함.
	//  String str = "abd";
		
    while(true) {
    	System.out.println("문자열 입력 >>");
    	String str = scanner.next();
    	if(str.equals("exit")) {
    		break;
    	}
    	System.out.println(str);
    }
		
//10번 피라미드 별
//		for(int i = 0; i < 5; i++) {
//			for(int j = 5-i; j > 1; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k <= i*2; k++)
//			System.out.print("*");
//		}
//		System.out.println();
//		

	}

}
