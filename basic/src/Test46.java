import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1-1 int형 5개 방의 배열을 만들고 10,20,30,40,50을 저장 ,출력
//		int[] room = new int[5];
//		room[0]=10;
//		room[1]=20;
//		room[2]=30;
//		room[3]=40;
//		room[4]=50;
//		for(int i =0; i < room.length; i++) {
//			System.out.println(room[i]);
//		}
//		
//		1-2 위 배열을 이용하여 인덱스 번호 1번과 3번방에 있는 데이터를 더한값을 출력
		
//		 System.out.println(room[1]+room[3]);
//		1-3 인덱스 번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력.
//		 System.out.println("0~4 사이 인덱스번호 입력 >>");
//		int index = scanner.nextInt();
//       System.out.println(room[index]);
//		1-4 배열안의 모든 데이터를 더한 값을 출력
//			int tot = 0;
//			 for(int i = 0; i < room.length; i++) {
//				 tot += room[i];
//			 }
//			 System.out.println("tot : " + tot );
//		
		
//		1-5 배열안에 있는 값중 하나를 입력하면 , 그 값이 위치한 인덱스번호를 출력,
//		System.out.println("10,20,30,40,50 중 하나 입력 :");
//		 int val = scanner.nextInt();
//		 for(int i = 0; i < room.length; i++) {
//			 if(val == room[i]) {
//				 System.out.println("index :"+ i);
//				 break; //이미 index 번호 찾았으니 반복문 강제 종료
//			 }
//		 }
//		1-6 인덱스번호 2번과 4번방의 값을 교환해보세요
//		 int tmp = room[2];
//		 room[2] = room[4];
//		 room[4] = tmp;
//		 for(int i = 0; i< room.length; i++) {
//			 System.out.println(room[i]);
//		 }
//		 //10,20,50,40,30
//		1-7 (심화) 배열안의 데이터를 내림차순으로 정렬해보세요.(큰수 ->작은수)
         //선택정렬
//		 for(int i = 0; i< room.length-1; i++) {
//			 int max = i; // 현재까지 최대값이 들어있는 인덱스번호 저장해 비교 (처음에는 i로 초기화)
//			 for(int j = i; j < room.length; j++) {
//				 if(room[max] < room[j]) {
//					 max =j; //더큰 값을 가지고 있는 인덱스 번호를 max에 저장
//				 }
//			 }
//			 int temp = room[max];
//			 room[max] = room[i];
//			 room[i] = temp;
//		 }
//		 //정렬 확인 출력
//		 for(int i =0; i < room.length; i++) {
//			 System.out.println(room[i]);
//		 }
		//버블정렬
//		for(int i = 0; i < room.length-1; i++) {
//			for(int j = i; j < room.length; j++) {
//				if(room[i] < room[j]) {
//					int temp = room[i];
//					room[i] = room[j];
//					room[j] = temp;
//				}
//			}
//		}
//		//정렬 확인 출력
//		for(int i = 0; i < room.length; i++) {
//			System.out.println(room[i]);
//		}
//		
		//1.문제. 최대값,최소값 구하기
//		 int[] score = {79,45,67,34,98,51};
//		 int max =score[0];
//		 int min =score[0];
//		 for(int i =0; i < score.length; i++) {
//			 if(score[i] > max) {
//				 max = score[i];
//			 }else if(score[i] < min){
//				 min = score[i];
//			 }
//		 }
//		 System.out.println("최대 : " + max);
//		 System.out.println("최소 : " + min
//				 );
//		1-1 int형 5개 방의 배열을 만들고 10,20,30,40,50을 저장 ,출력
//	   int[] arr = {10,20,30,40,50};
//	     for(int i = 0; i < arr.length; i++) {
//	    	 System.out.println(arr[i]);
//	     }
//		1-2 위 배열을 이용하여 인덱스 번호 1번과 3번방에 있는 데이터를 더한값을 출력
//				int[] index = {10,20,30,40,50};
//				System.out.println(index[0]+index[3]);
//				
//		1-3 인덱스 번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력.
//		int[] arr = {10,20,30,40,50};
//		System.out.println("0,1,2,3,4중 입력");
//		 int index = scanner.nextInt();
//		 System.out.println(arr[index]);
//		1-4 배열안의 모든 데이터를 더한 값을 출력
//		int[] arr = {10,20,30,40,50};
//		int tot = 0;
//		for(int i = 0; i < arr.length; i++) {
//			tot += arr[i];
//		}
//		System.out.println(tot);
//		
//		1-5 배열안에 있는 값중 하나를 입력하면 , 그 값이 위치한 인덱스번호를 출력,
		
//		1-6 인덱스번호 2번과 4번방의 값을 교환해보세요
//		
		// 피라미드 별
		  int n = scanner.nextInt();
		  for(int i = 0; i < n; i++) {
			  for(int j = 1; j < n-i; j++) {
				  System.out.print(" ");
			  }
			  for(int j = 0; j<i*2+1; j++) {
				  System.out.print("*");
			  }
			  System.out.println("");
		  }
		
		
	}

}
