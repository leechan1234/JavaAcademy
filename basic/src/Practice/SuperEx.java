package Practice;
//상속 받아서 호출
class Parent{
	
	int number = 3;
	Parent(){
		System.out.println("부모 객체 생성");
	}
	 
}
class Child extends Parent{
//	int number = 2;
	Child(){
		System.out.println("자식 객체 생성");
	}
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		
	}
}



public class SuperEx {

	public static void main(String[] args) {
		Child c =new Child();
		c.print();
	}

}
