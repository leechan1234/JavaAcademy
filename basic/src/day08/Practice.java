package day08;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
			int dice =(int)(Math.random()*6)+1;
			System.out.println("주사위 숫자" + dice);
			count++;
			if(dice == 6) {
				System.out.println("총 굴린횟수 " + count);
				break;
			}
		
		}

	}

}
