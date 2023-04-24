package day03;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("1 입력");
			break;
		case 2:
			 System.out.println("2입력");
			 break;
		case 3 :
			System.out.println("3입력");
			break;
			default :
			System.out.println("1,2,3 이 아닌 숫자 입력");
			
		}

	}

}
