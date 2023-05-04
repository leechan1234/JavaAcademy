package day16problem;

import java.util.HashMap;
import java.util.Scanner;

// HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
// 학생이름 key, 점수 value (단, 학생이름은 중복안된다는 가정하에 작업하세요)
// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 6번을 입력받으면 프로그램 종료. 
/*
 	** 자바 성적 관리 프로그램 **
	1. 전체 조회 
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료
*/

public class CollEx02 {
	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<>();
		 Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("** 자바 성적 관리 프로그램 **");
            System.out.println("1. 전체 조회");
            System.out.println("2. 등록");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 전체 평균");
            System.out.println("6. 프로그램 종료");

            System.out.print("원하는 메뉴 번호를 입력하세요 >> ");
            int menu = scanner.nextInt(); // 사용자가 선택한 메뉴 번호
            scanner.nextLine(); // 엔터키 제거

            switch (menu) {
                case 1: // 전체 조회
                    if (map.isEmpty()) { // 저장된 데이터가 없는 경우
                        System.out.println("등록된 학생이 없습니다.");
                    } else {
                        System.out.println("<학생 목록>");
                        for (String name : map.keySet()) {
                            System.out.println(name + " : " + map.get(name));
                        }
                    }
                    break;
                case 2: // 등록
                    System.out.println("등록하실 학생 이름 입력 >>");
                    String name = scanner.nextLine(); // 학생 이름 입력 받기
                    System.out.println("등록하실 학생 점수 입력 >>");
                    int score = scanner.nextInt(); // 학생 점수 입력 받기
                    scanner.nextLine(); // 엔터키 제거

                    // 학생 이름이 이미 존재하는 경우
                    if (map.containsKey(name)) {
                        System.out.println("이미 등록된 학생입니다.");
                    }
                    // 새로운 학생인 경우
                    else {
                        map.put(name, score);
                        System.out.println(name + " 학생이 " + score + "점으로 등록되었습니다.");
                    }
                    break;
                case 3: // 수정
                    System.out.println("수정하실 학생 이름 입력 >>");
                    name = scanner.nextLine(); // 수정할 학생 이름 입력 받기

                    // 수정하려는 학생이 이미 존재하는 경우
                    if (map.containsKey(name)) {
                        System.out.println(name + " 학생의 수정할 점수 입력 >>");
                        score = scanner.nextInt(); // 수정할 학생의 새로운 점수 입력 받기
                        scanner.nextLine(); // 엔터키 제거

                        map.put(name, score); // 해당 학생의 점수 수정
                        System.out.println(name + " 학생의 점수가 " + score + "점으로 수정되었습니다.");
                    }
                    // 수정하려는 학생이 존재하지 않는 경우
                    else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case 4: //삭제
                	System.out.println("삭제하실 학생의 이름 입력하세요");
                	name = scanner.nextLine();
                	if(map.equals(name)) {
                		System.out.println("등록되지 않는 학생 입니다");
                	}else {
                		map.remove(name);
                	}
                	System.out.println(name + "학생이 삭제 되었습니다");
                	break;
                case 5:
                   
                case 6 :
                	System.out.println("프로그램 종료");
                		default :

            }
        }

		
		
		
		
		
	}
}
