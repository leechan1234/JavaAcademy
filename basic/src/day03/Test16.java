package day03;

public class Test16 {

	public static void main(String[] args) {
    //비교연산자 : 결과는 true /false
		
		int a =10;
		int b =0;
//		
//		boolean result = a > b + 20;
//		boolean result = a != b;
//		System.out.println(result);
//		
		//논리 연산자 : && ||
		//논리연산자 :  && : and :조건식 모두 참이어야 참
//		boolean r = a > b || b > 0;
//		System.out.println("r = " + r);
		//삼항 연산자 : 조건식? 참일경우결과값 : 거짓일 경우 결과값
		System.out.println(a > b ? a : b);
		int result  = a > b ? a : b;
		System.out.println(result);
		String resCh= a > b ? "O" : "X";
		System.out.println(resCh);
		
		
		
	}

}
