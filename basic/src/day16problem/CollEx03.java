package  day16problem;

import java.util.HashMap;
import java.util.Scanner;

/*
	id와 tel(전화번호)로 구성되는 Student클래스를 만들고, 
	이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/

class Student{
	String id;
	String tel;

 Student(String id ,String tel ){
	 this.id=id;
	 this.tel=tel;
 }
 
 public String getId() {
	return id;
}
 public String getTel() {
	return tel;
}
 
 
}

public class CollEx03 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		HashMap<String, Student > map = new HashMap<>();
		//등록
		map.put("홍길동", new Student("20230102" ,"010-123-456"));
		map.put("홍길", new Student("20230102" ,"010-456-465456"));
		map.put("홍", new Student("20230102" ,"010-12346-148456"));
		
		while(true){
			System.out.println("이름을 입력 하십시오>>");
			String name = scanner.nextLine();
			if(map.containsKey(name)) {
				Student stu = map.get(name);
				System.out.println("아이디 : " +  stu.id + " 전화번호 : " + stu.tel );
			}else {
				System.out.println("등록되지 않는 이름 입니다");
			}
	   }
    }
}
