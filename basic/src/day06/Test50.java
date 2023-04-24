package day06;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Test50 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
//	      //문제2-1. 게임랭킹보드. 각 5개의 데이터를 저장할 수 있는 
//	      //         users와 scores라는 이름의 배열이 있고, 
//	      //         users 배열에는 유저네임, scores 배열에는 유저의게임 점수를 입력받아 저장한다. 
//	      //         단, 유저네임과 게임점수 배열의 인덱스번호가 일치하게 저장. 
//	      //         ex) users[0] 방 유저네임의 게임점수는 scores[0] 방에 저장 
//		String[] users = new String[5]; // 유저 이름들 저장할 배열
//		int[] scores= new int[5];  //게임 점수들 저장할 배열
//		 for (int i = 0; i < users.length; i++) {
//			System.out.println("유저 네임 >" );
//			//String name = scanner.nextLine(); // 어차피 입력받은거 바로 배열에 저장할거라 한줄로 줄일 수 있음
//			users[i] = scanner.nextLine();
//			//게임 점수 입력받아 저장
//			System.out.println("점수 >>");
//			scores[i] = scanner.nextInt();
//		}
//	      
//	      //문제2-2. 위 저장된 users와 scores를 아래와 같은 형태로 전체 출력해보세요. 
//	      //      출력예)    user_name      score
//	      //            --------------------------------
//	      //               피카츄         87
//	      //               파이리         24
//	      //               ....
//		 System.out.println("user_name\t score");
//		 System.out.println("-----------------");
//	      for(int i = 0; i < scores.length; i++) {
//	    	  System.out.println(users[i] + "\t\t" + scores[i]);
//	      }
//	      //문제2-3. 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌어 저장되었다합니다. 
//	      //      점수를 교환해 주세요.  idx = 1, idx = 2
//	      int tmp = scores[1];
//	      scores[1] =scores[2];
//	      scores[2] = tmp;
//			 System.out.println("user_name\t score");
//			 System.out.println("-----------------");
//			 for (int i = 0; i < scores.length; i++) {
//				System.out.println(users[i] + "\t\t" + scores[i]);
//			}
//	      
//	      
//	      //문제2-4. 점수가 높은 순으로 출력되는 게임 랭킹 보드를 만들어주세요. 
//	      //      랭킹 보드는 1위부터 5위까지 출력됩니다. 
//	      //      출력예) rank      user_name      score
//	      //            --------------------------------
//	      //            1.         꼬북이         96   
//	      //            2.         피카츄         87
//	      //            3.         라이츄         57
//	      //               ....      
//			 System.out.println("rank\t user_name\t score");
//			 System.out.println("-----------------");
//	      //정렬 : score 기준으로 내림차순(점수가 큰 순서대로) + 유저네임도 같이 자리교환
//			for (int i = 0; i < scores.length; i++) {
//				for(int  j= i+1; j < scores.length; j++) {
//					if(scores[i] < scores[j]) {
//						int temp = scores[i];
//						scores[i]= scores[j];
//						scores[j] = temp;
//						// 유저 네임도 같이 자리 교환
//						String sTemp = users[i];
//						users[i] = users[j];
//						users[i] = users[j];
//						users[j] = sTemp;
//					}
//				}
//			}
//		
//			 for (int i = 0; i < scores.length; i++) {
//				System.out.println((i + 1) + users[i] + "\t\t" + scores[i]);
//			 }
//	      //문제2-5. 또 한명의 유저가 게임을 끝냈습니다. 점수와 유저네임을 입력받고, 
//	      //      기존 게임 랭킹보드를 업데이트하여 1~5위까지 출력해주세요. 
//	      //      이때 입력받은 새로운 유저의 데이터는 기존 데이터에 추가 되어야함(1-3 문제참고)
//	      //      업데이트 방법 : 1) 랭킹은 5위까지만 출력 
//	      //                  2) 새로 입력받은 유저의 점수가 5위보다 낮으면 출력X 
//	      //                     순위권 안에 들어노는 점수면 순위에 맞춰 출력
//			 
//			 //배열 방 크게 만들기 : 기존 배열 복사해두고 방크게 만든 후 다시 옮겨담기
//			 int len = scores.length; // 기존 배열의 길이 따로 저장
//			 //기존 데이터 주소값 복사 해두기
//			 int[] scoresTmp = scores;
//			 String[] usersTmp = users;
//			 // 6개 방으로 새로 할당(기존 방보다 1개 더 크게 만들기)
//			 scores = new int[len + 1];
//			 users = new String[len+1];
//			 // 복사해둔 기존 데이터 옮겨 담기
//			 for(int i = 0; i <len; i++) {
//				 scores[i] = scoresTmp[i];
//				 users[i] =usersTmp[i];
//			 }
//			 
//			 // 새 유저네임과 점수 입력받아 마지막 방에 저장
//			 System.out.println("이름 >>");
//			 users[len] =scanner.nextLine();
//			 System.out.println("점수 >>");
//			 
//			 // 내림차순으로 정렬
//			 // 1~5위 순위 출력
//			 System.out.println("rank\t user_name\tscore");
//			 System.out.println("-----------------");
//			 for (int i = 0; i < scores.length; i++) {
//				System.out.println(users[i] + "\t\t" + scores[i]);
//			}

		// 문제4. 한층에 5호씩 있는 3층짜리 아파트가 있다. 

			/*
			int[][] fee = new int[3][5]; // 아파트 관리비 저장할 배열 생성
			
			//	1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요. 
			// 각 호마다 관리비 입력받아 저장 처리  
			for(int i = 0; i < fee.length; i++) {
				for(int j = 0; j < fee[i].length; j++) {
					System.out.print(">>");
					fee[i][j] = Integer.parseInt(sc.nextLine());
				}
			}
			// 전체 출력 
			for(int i = 0; i < fee.length; i++) {
				for(int j = 0; j < fee[i].length; j++) {
					System.out.print(fee[i][j] + "\t");
				}
				System.out.println();
			}
			*/
			
			
			//	2) 층별 관리비 평균을 구해서 출력해보세요. 
			/* 1층 i=0 j=0~4 
			int total1 = 0; 
			for(int j = 0; j < fee[0].length; j++) {
				total1 += fee[0][j];
			}
			System.out.println("1층 관리비 평균 : " + (total1/5.0));
			// 2층 i=1
			int total2 = 0; 
			for(int j = 0; j < fee[1].length; j++) {
				total2 += fee[1][j];
			}
			System.out.println("2층 관리비 평균 : " + (total2/5.0));
			// 3층 1=2
			int total3 = 0; 
			for(int j = 0; j < fee[2].length; j++) {
				total3 += fee[2][j];
			}
			System.out.println("3층 관리비 평균 : " + (total3/5.0));
			
			// 각 층마다 총합더해놓을 배열
			int [] tot = new int[fee.length]; // 층수만큼 방만들기 
			for(int i = 0; i < fee.length; i++) {
				for(int j = 0; j < fee[i].length; j++) { // 2중 for문으로 각 fee방에 모두 접근 
					tot[i] += fee[i][j]; // 방에 저장된 관리비 꺼내서 해당 층수의 tot방에 누적해서 더하기 
				}
				System.out.println((i+1) + "층 관리비 평균 : " + (tot[i]/5.0));// tot 누적된것에 평균 구하기 
			}*/
//			int[][] fee = { 
//					{45,32,66,86,35},
//					{34, 2,45,79,42},
//					{12,30,57,98,44} };
//			int[][] ho = {
//					{101,102,103,104,105},
//					{201,202,203,204,205},
//					{301,302,303,304,305} };
			
			//	3) 전체 관리비 평균을 구해서 출력해보세요.
//			int total = 0; 
//			for(int i = 0; i < fee.length; i++) {
//				for(int j = 0; j < fee[i].length; j++) {
//					total += fee[i][j]; 
//				}
//			}
//			double avg = total / 15.0;
//			System.out.println("전체 관리비 평균 : " + avg);
//			
//			// 	4) 103호와 203호의 관리비가 서로 바뀌었다고 합니다. 교환해주세요.
//			int tmp = fee[0][2];
//			fee[0][2] = fee[1][2];
//			fee[1][2] = tmp; 
//			
//			//	5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요. 
//			for(int i = 0; i < fee.length; i++) {
//				for(int j = 0; j < fee[i].length; j++) { // 모든 fee 방에 들어가 avg보다 작으면 ho 출력 
//					if(avg > fee[i][j]) {
//						System.out.println(ho[i][j] + "호");
//					}
//				}
//			}
//		   int[][] fee = { 
//					{45,32,66,86,35},
//					{34, 2,45,79,42},
//					{12,30,57,98,44} };
//			int[][] ho = {
//					{101,102,103,104,105},
//					{201,202,203,204,205},
//					{301,302,303,304,305} };
//			//  6) 관리비 가장 적게 나온 호수와 가장 많이 나온 호수를 출력해보세요. (최대값, 최소값) 
//			//관리비 가장 많이 나온것
//		   int max= fee[0][0]; // 최대 관리비 들고 비교할 변수
//		   int maxIdxI=0;		//최대 관리비 인덱스번호 i 담을 변수
//		   int maxIdxJ=0;		//최대 관리비 인덱스번호 j담을 변수
//		   //관리비 가장 적게나온것
//		   int min = fee[0][0];
//		   int minIdxI=0;		
//		   int minIdxJ=0;	
//		   for(int i = 0; i < fee.length; i++) {
//			   for(int j = 0; j < fee[i].length; j++) {
//				   if(max < fee[i][j]) {
//					   max = fee[i][j];
//					   maxIdxI = i;
//					   maxIdxJ = j;
//				   }
//			   }
//		   }
//		   System.out.println("최대 관리비 : " + ho[maxIdxI][maxIdxJ] + "호 (" + max + "원" );
			//  7) 관리비 적게 나온순으로 정렬해보세요. 
			 //2차원 배열 -> 1차원 배열 -> 정렬
		// * 1차원,다차원 배열 * 
		      // 문제1. 2차원 배열 arr을 아래와 같이 출력하는 프로그램을 작성하세요. 
//		      int [][] arr = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
		      /*
		         1
		         1 2 3
		         1
		         1 2 3 4
		         1 2
		      */
		      
		      
		      // 문제2. Scanner로 소문자 알파벳하나 입력받고, 아래와 같이 출력하는 프로그램을 작성. 
		      /*    (콘솔예)
		         소문자 알파벳 하나를 입력하세요 >>  e (<--사용자 입력)
		         abcde
		         abcd
		         abc
		         ab
		         a 
		      */
//		       System.out.println("소문자 알파벳하나 입력 하세요 >>");
//		       String input = scanner.nextLine();
//		      char ch = input.charAt(0); //a == 97 b c d e
//		      System.out.println((int)ch);
//		      for(int i = ch; i >= 97; i--) {
//		    	  for(int j =97; j <=i; j++) {
//		    		  System.out.print((char)j);
//		    	  }
//		    	  System.out.println();
//		      }
		      // 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램을 작성 
		      
		      
		      // 문제4. 4x4의 2차원 배열(총 방16개)을 만들고, 1 ~ 10까지 범위의 정수 10개만 
		      //      랜덤하게 생성하여 임의의 배열 위치에 저장하세요. 
		      //      동일한 랜덤값 정수가 있어도 상관없으나, 
		      //      16개 방중 랜덤값이 체워지지 않은 6개의 방은 모두 0으로 만들어야 합니다. 
		      //      아래 이미지를 참고하여 마지막으로 4x4 형태로 출력까지 해보세요. 
		      /*
		            예)
		            3   0   7   2
		            0   8   2   5
		            6   0   1   5
		            0   9   0   0
		      */
			
//		      
//		         * Up & Down 게임 *
//		         0 ~ 99 사이의 임의의 수를 받아 숨기고, 그 수를 맞추는 게임. 
//		         임의의 수보다 낮게 입력하면 "Up"출력, 높게 입력하면 "Down"출력하면서
//		         범위를 좁혀가며 숫자를 맞추는 게임입니다. 
//		         숫자를 맞추면, 게임을 반복하기 위해서 y/n 묻고, 
//		         n을 입력한 경우 프로그램 종료, 그렇지 않으면 게임 처음부터 다시 시작.  
		        boolean play = true;
		        
		        while(play) { //게임 전체를 반복시킬 while문
		         int num = (int)(Math.random() *100 ); //0~99 사이의 임의의 수를 받기
		        	int count=1; //입력회차
		        	int guess = -1; //입력한값 저장할 변수
		        	int low = 0; //낮은 범위
		        	int high = 99; //큰범위
		        	
		        	System.out.println("숫자가 정해졌습니다. 맞춰 보세요.");
		        while(true) {
		        	//범위 출력
		        	System.out.println(low + "~" + high);
		        	System.out.println(count + ">>");
		        	count++;
		        	//숫자 입력받고
		        	guess = scanner.nextInt();
		        	//결과 보여주고(up,down, 맞았습니다)
		        	if(guess == num) {
		        		System.out.println("맞았습니다");
		        		System.out.println("게임을 다시 하시겠습니가? (y/n) >>");
		        		String answer = scanner.nextLine();
		        		if(answer.equalsIgnoreCase("n")) {
		        			System.out.println("프로그램종료!!");
		        			play = false;
		        			break;
		        		}else if(answer.equalsIgnoreCase("y")) {
		        			play = true;
		        			break;
		        		}else {
		        			System.out.println("잘못 누르셨습니다");
		        			continue; //안쪽 while문 종료
		        		}
		        	}
		        	if(guess < num) {//작게 입력
		        		System.out.println("Up");
		        		low = guess; //작은 범위를 입력한 수로 변경
		        	}
		        	if(guess > num) { // 크게 입력
		        		System.out.println("Down");
		        		high = guess;// 큰 범위를 입력한 수로 변경
		        	}
		        }
		        	
		        	
		        	
		        	
		        }
		        System.out.println("종료");
		
		
		
		
	
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		

		        
	}

}
