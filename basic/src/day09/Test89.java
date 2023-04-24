package day09;

class Book2{
	String  title;
	String author;
	Book2(){//생성자 생성
		this("무제","작자미상");
		System.out.println("생성자 매개변수 없는거 호출");
	}
	Book2(String title){
		this(title, "작자미상"); // 생성자는 첫번째 있어야한다 (초기화)
		System.out.println("생성자 매개변수 1개 호출");
		//매개변수 2개 있는 생성자를 호출해 대신 처리하게 해준다.
		this.title = title;
		this.author = "작자미상";
	}
	Book2(String title, String author){
		System.out.println("생성자 매개변수 2개 호출");
		this.title = title;
		this.author = author;
	}
	void show() {
		System.out.println(title + " "+ author);
	}
	
}
public interface Test89 {
public static void main(String[] args) {
	
	Book2 un = new Book2();//에러나는 이유 기본생성자가 안만들어짐 새로만들어야함
	un.show();
	
//	 Book2 lp =new Book2("어린왕자","생텍쥐베리");
//	 lp.show();
//	 Book2 kong = new Book2("콩쥐팥쥐");
//	 kong.show();
}
}
