package day08;
class MyCard{
	int sum;
	boolean isGwang;
}
class Student{
String name;
int age;
}


public class Test74 {

	public static void main(String[] args) {
		MyCard c = new MyCard();
		c.sum=3;
		c.isGwang = false;
		System.out.println(c.sum);
		System.out.println(c.isGwang);
		Student s = new Student();
		s.name = "학생";
		s.age = 25;
		
	

	}

}
