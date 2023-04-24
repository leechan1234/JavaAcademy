package day03;

import java.util.Iterator;
import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//문제  : 점수를 입력받고 90점 이상이면 "수", 80점 이상이면 " 우 "
		//      70점 이상이면 "미", 그 이하는 "재시험" 출력
		System.out.println("점수를 입력 하십시오");
	
		int score = scanner.nextInt();
		if (score >= 90 && score  <= 100) {
			System.out.println("수");
		}else if (score >= 80 && score < 90) {
			System.out.println("우");
		}else if (score >= 70 && score < 80) {
		System.out.println("미");
		}else {
			System.out.println("재시험");
		}
			
		if (score  > 100) {
			if (score > 40) {
				
			}else {
				
			}
		}
		

	}

}
