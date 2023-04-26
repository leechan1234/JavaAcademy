package day11;

//final class Super{  
//	
//	
//}
//class Sub extends Super{ 상속 안됨
//	
//}
/*
class Super{
	final void func() {}
}
class Sub extends Super{
	@Override
	void func() { final로 인해 오버라이딩 불가능
		
	}
}
*/

public class Test115 {
final static int x = 10; //클래스 상수
final int y = 20; //인스턴스변수
	

	public static void main(String[] args) {
			final int z = 30; // 지역 상수
			x = 100;
			Test115 t = new Test115();
			t.y = 200;
			t.z = 300;
	}




class Super{
	final int x;
	Super()	{
		x = 10;}
	Super(int x){
		this.x  = x;
		for(int i = 0; i < 5, i++)}
	
	}
	}
	int[] players = new int[5]
//			final int PLAYER  NUM =10;
			
}