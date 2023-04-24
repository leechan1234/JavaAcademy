package dya02;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.println("이름을 입력해주세요");
    String name =sc.nextLine();
    System.out.println("이름 : " + name);
   System.out.println("나이를 입력해주세요:");
//   String age = sc.nextLine();
int intAge=Integer.parseInt(sc.nextLine());
   System.out.println("내년의 당신의 나이는 : " + (intAge+1)+"살 입니다.");
   
   //4.Scanner 객체 닫기
	sc.close();
	
	}

}

