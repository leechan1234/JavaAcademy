package day10;

public class Person1 {
	private int age;
	private int height;
	private int addNumber;
	private String name;
	private String B;
	private String add;
	private String num;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int age) {
		this.height=height;
	}
	
	public int getaddNumber() {
		return height;
	}
	public void setaddNumber(int age) {
		this.height=height;
	}

	public static void main(String[] args) {
		//이름,나이,혈액형,키,주소,전화번호 주민번호에 해당하는 변수들과 각 변수의 해당하는 get/set 메서드 만들기
		Person1  p = new Person1();
		p.setAge(25);
		System.out.println("나이 : " + p.getAge());
		p.setHeight(0);
		System.out.println("키" + p.getHeight() +"cm");
	}

}
