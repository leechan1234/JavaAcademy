package day16problem;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
	ArrayList에 저장하고, 
	ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
	평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D
		2.3333333333333335
*/





// (각 배열의 문자한개를 char로 변환 String의 .charAt() -> char타입으로 리턴) 



public class CollEx05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grades = new ArrayList<>();
        // 출력문 띄우고 
        System.out.println("'A', 'B', 'C', 'D', 'F' 중 6개 입력");
        // 학점 입력받기
        String grade = scanner.nextLine();
        // 입력받은거 띄어쓰기 구분자로 분할 String 의 split() -> String[] 배열 
        String[] grd = grade.split(" ");
        // 리턴받은것을 ArrayList에 저장 -> .add(String배열의값한개)
        for (int i = 0; i < grd.length; i++) {
			grades.add(grd[i]);
        }

        // ArrayList에 저장된 문자를 모두 점수로 바꿔서 총합을 구하기 
        // 		ArrayList 첫번째 방에 있는 학점하나를 꺼내서 점수로 바꾸기 
        //		각 학점이 무엇인지 검사해서 학점으로 바꾸기 --> if 
        double tot = 0;
        for (int i = 0; i < grades.size(); i++) {
        	String score = grades.get(i); // 학점하나 꺼내기 
            double scoreNum = 0;
            if(score.equals("A")) {
            	scoreNum = 4.0;
            }else if(score.equals("B")) {
            	scoreNum = 3.0;
            }else if(score.equals("C")) {
            	scoreNum = 2.0;
            }else if(score.equals("D")) {
            	scoreNum = 1.0;
            }else if(score.equals("F")) {
            	scoreNum = 0;
            }	
            tot += scoreNum;
		}
        System.out.println(tot/6);
        
        
        
        // 6개로 나눠서 평균 구해 출력 

        
        
        
        
        
        
        
        
        
    }
}