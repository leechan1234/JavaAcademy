package day13;

public class Test144 {

	public static void main(String[] args) {
		 
		int number = 100;
		int result = 0;
		
		// 0으로 예외발생시키고 10번 끝까지 돌리기
			for(int i = 0; i< 10; i++) {
			try {
				result = number/(int)(Math.random() *10);
				System.out.println(result);
			}catch(NullPointerException e) {
				System.out.println("NullPointer 발생");
			}catch(ArithmeticException e){ //통으로 묶기
				System.out.println("0으로 나눌 수 없습니다");
			}catch(Exception e) {
				System.out.println(" 그 외 다른 예외 발생");
			}
				
			
		}
	
	}
}

	
		
		
		
		
		
		
		
		
		
		/*
		try {
			for(int i = 0; i< 10; i++) {
				result = number/(int)(Math.random() *10);
				System.out.println(result);	
			}
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다");
		}
		*/
		
	

		

	


