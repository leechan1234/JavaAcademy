package day12;

//인터페이스
interface Test{
	public static final int NUM = 1; // 상수
	public abstract void func(); 	//추상메서드
	
	//int x = 100; // 앞부분 생략한 버전
	//void sub();
}
//인터페이스를 구현한 클래스 -> 객체 생성하여 사용 가능
class Inter implements Test{

	@Override
	public void func() {
		System.out.println("implements!!!");
		
	}
	interface Test2{
		void sub();
	}
	
}

class Inter implements Test, Test2{
	
}
		
public class Test127 {

	public static void main(String[] args) {
		 
		Inter i = new Inter();
		i.func();

	}

}
