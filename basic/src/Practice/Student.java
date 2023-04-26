package Practice;

public class Student {
	//지정생성자 학과 이름 나이 설정
	String name;
	String department;
	int age;
	//지정 생성자
//	Student(String n, String d, int a){
//		name = n;
//		department = d;
//	    age = a;
		//기본 생성자
	Student(String n ,String d, int a){
		this.department = d;
		this.name  = n;
		this.age = a;
		
	}




	public static void main(String[] args) {
		//매개변수가 있는 객체 생성
//		Student s =new Student("홍길동", "소프트", 20);
//		
//		System.out.println(s.age);
//		System.out.println(s.department);
//		System.out.println(s.name);
//		Student s1 =new Student("홍길동1", "소프트1", 201);
//		System.out.println(s1.age);
//		System.out.println(s1.name);
//		System.out.println(s1.department);
		Student s = new Student("소프트", "홍길", 10);
		System.out.println(s.age);
		System.out.println(s.department);
		System.out.println(s.name);
		
		
	
		
		
	}

}
