package day03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	int h = scanner.nextInt();
	int m = scanner.nextInt();
	//45분 일찍 일어나게 설정 예제입력 10 10
	//9 25 출력
	if(m < 45) {
		h--; //시간 감소
		m = 60-(45-m);
		if(h < 0) {
			h = 23;
		}
		System.out.println(h + "" + m);
	}
	
}
	
}

