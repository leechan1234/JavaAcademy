package day16problem;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 ArrayList에 저장하고,
	벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
	실행예시:
		정수>> 10 6 22 6 88 77 -1
		가장 큰 수는 88
*/

public class CollEx04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("-1이 될때까지 숫자를 입력하세요 >>");
     while(true) {
    	 int user = scanner.nextInt();
    	 if(user == -1) {
    		 int max =Integer.MIN_VALUE;
    		for (int i = 0; i < arr.size(); i++) {
    			 int current = arr.get(i);
				if(current > max) {
					max = current;
				}
			}
    		 System.out.println("가장 큰 수 출력 : " + max);
    	 }
    	arr.add(user);
     }

	}
}
