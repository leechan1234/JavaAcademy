package day05;

public class Test42 {

	public static void main(String[] args) {
//		int[] num = new int[10];
//		//모든방 100으로 초기화
//		for(int i = 0; i < num.length; i++) {
//			num[i]= 100;
//		}
//		//출력확인
//		for(int i = 0; i < 10; i++) {
//			System.out.println(num[i]);
//		}
//		//초기화
//		 int[] arr = {10,20,30,40,50};
//		 System.out.println(arr[0]);
//		 
//		 double[] darr = {1.1,1.2,1.3};
//		 
//		 String[] sArr = {"java", "jsp", "spring"};
//		 for(int i = 0; i< sArr.length; i++) {
//			 System.out.println(sArr[i]);
//		 }
		 
		 //
		//1.문제. 최대값,최소값 구하기
		 int[] score = {79,45,67,34,98,51};
		  int max = score[0]; // 비교할때 현재까지의 최대값을 들고 다닐 변수
		  int min = score[0];
		  for(int i = 0; i <score.length; i++) {
			  if(score[i] > max) {
				  max = score[i];
			  }else if(score[i] < min) {
				  min= score[i];
			  }
		  }
		  System.out.println("최대 : " +max);
		 System.out.println("최소 : " + min)
		 ;
		  
	}

}
