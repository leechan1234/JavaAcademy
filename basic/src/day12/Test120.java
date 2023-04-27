package day12;

class A{
	int x;			// x, add()
	void add() {
		System.out.println("AAA");
	}
}
class B extends A{ 	//x,y,add(),sub()
	int y;
	@Override
	void add() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("subsub");
	}
}

class C extends A{
	
}
public class Test120 {

	public static void main(String[] args) {
		
		A a = new B();
		B b =null;
		//두 변수 타입이 다르니 형변환 담는것을 형변환
		
		//확인하고싶은객체 intanceof 검사할클래스타입 --> True/false 로 결과 돌려줌
		// B와 B의 조상들까지 true
		if(a instanceof B) {//a가 실제 가지고 있느 객체가 B의 객체가 맞으면 true
			System.out.println("a는 B의 객체다");
			b = (B)a;
			b.add();
		}
		
		
		
		
		
		
		/*
		A a = null;
		B b = new B(); // x , @add(), y , sub()
		//                A   A@B    B    B
		a =(A)b; // b가 들고 있는 자식 객체 부모타입 변수 a에 대입 가능
		*/
//		A a = new A();
//		B b = null;
//		
//		b=(B)a; // 컴파일은 되나 실행할때 에러
//		b.add();
		//자식 타입 변수에 부모 객체 담기 x !!!
		/*
		A a = null;
		B b = new B();
		B b2 = null;
		//형변환 공식을 적어주는 이유는 변수의 타입이 달라서
		a = (A)b; // 다형성 upcasting
		b2 = (B)a;//다형성 downcasting
		//실행이 되는 것은 실제 생성된 객체가 B타입이 달라서
		b2.add();
		b2.sub();
		//부모타입에 자식객체를 담을려고 하면 형변환을 해준다
		*/
		
	
		/*
		// 기본 객체 생성
		A a = new A();//x , add()
		B b = new B();// x y , @add() , sub()
		a.add();
		b.add();
		
		
		//!!!!!!!!!!다형성 : 부모(조상) 타입의 변수에 자식 객체를 담을 수 있다./ 담을 때에는 형변환
		A aa =new B();//부모에 자식 가능 x,@add() / ( y, sub() )x
//		B bb =new A(); 자식에 부모는 불가능
		//부모자신의 것만 알아볼수 있고 자식이 가져온거는 모른다. 
		 * 오버라이드되면 자식거를 호출
//	      aa.x
		aa.add();       
		*/
		
	}

}
