package day05;

public class Test43 {

	public static void main(String[] args) {
		//random
		
	System.out.println(Math.random());// 0 ~ 1 사이의 임의의 실수값
	
	// 0 ~ 9 사이의 임의 숫자를 한개 받고
//	for(int i = 0; i < 10; i++) {
//	System.out.println((int)(Math.random() * 10));
//	}

	// 0 ~ 9 사이의 임의 숫자를 한개 받고
//		for(int i = 0; i <= 10; i++) {
//		System.out.println((int)(Math.random() * 10));
//		}
	//문제1. 1~10 사이의 임의 수 출력
	 for(int i = 0; i<10; i++) {
		 System.out.println((int)(Math.random() *10)+1);
	 }
	//문제2. 8~17 사이의 임의의 수 출력
//	 for(int i = 0; i<10; i++) {
//		 System.out.println((int)(Math.random() *10)+8);
//	 }
//		
}
}
