package day16problem;

import java.util.HashMap;
import java.util.Scanner;

public class CollEx01 {
	public static void main(String[] args) {

		// 영한 사전 만들기 
		// HashMap을 이용하여 10개의 단어를 영어,한글의 쌍으로 저장하고 
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료!
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
	        map.put("banana", "바나나");
	        map.put("cherry", "체리");
	        map.put("orange", "오렌지");
	        map.put("grape", "포도");
	        map.put("watermelon", "수박");
	        map.put("pineapple", "파인애플");
	        map.put("strawberry", "딸기");
	        map.put("melon", "멜론");
	        map.put("peach", "복숭아");
	        
	        //무한반복
	        while(true) {
	        	System.out.println("영어 단어를 입력하세요 : " );
	        	String word = scanner.nextLine();
	        	if( word.equals("exit")) {
	        		break;
	        	}
	        	String mean = map.get(word);
	        	if(mean != null) {
	        		System.out.println(word + " 뜻은 " + mean + "입니다");
	        	}else {
	        		System.out.println(word + "없는 단어 입니다");
	        	}
	        }
	        System.out.println("프로그램을 종료 합니다");
	    }
	
	   }
