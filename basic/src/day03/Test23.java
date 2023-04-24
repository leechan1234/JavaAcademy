package day03;
import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//문제1. 정수를 입력받아 3~5는 "봄", 6~8은 "여름"
		//		 9~11은 " 가을", 12~2는 "겨울" 을 출력
		//		그 외는 "잘못입력"을 출력하세여
//		int user = scanner.nextInt();
//		System.out.println("숫자 입력");
//		switch (user) {
//		case 3 : case 4 : case 5 :
//			System.out.println("봄");
//			break;
//		case 6 : case 7 : case 8 :
//			System.out.println("여름");
//			break;
//		case 9 : case 10 :
//			System.out.println("가을");
//			break;
//		case 11 : case 12 : case 1 : case 2:
//			System.out.println("겨울");
//			break;
//			default :
//				System.out.println(" 잘못 입력");

		
		//문제 2. 점수를 하나 입력받고 , 90~100 "수", 80~89 "우" 70~79 "미",
//				60~69 "양", 그 이하는 "가"를 출력해보세요.
//		System.out.println("숫자입력");
//		int user = scanner.nextInt();
//		
//		
//		switch (user/10) {
//		case  10 : case 9 :
//			System.out.println("수");
//			break;
//		case 8 :
//			System.out.println("우");
//			break;
//		case 7 :
//			System.out.println("미");
//		case 6 :
//				System.out.println("양");
//				break;
//				default :
//					System.out.println("가");
//		}
		
		 //문제 3. +(덧셈), - (뺄샘), *(곱셈), / (나눗셈) 중 원하는 연산기호를
		 // 	입력받아 , a b 변수의 연산 결과를 출력하세요.
		int a = 10, b= 3;
		System.out.println("+ - * / 중 하나 입력 : ");
		String op = scanner.nextLine();
		switch(op) {
		case "+" :
			System.out.println(a + b);
			break;
		case "-" :
			System.out.println(a - b);
			break;
		case "*" : 
			System.out.println(a * b);
			break;
		case "/" : 
			System.out.println(a / b);
			break;
			default:
				System.out.println("잘못입력하셨습니다");
			
		}
 	}
}


	


