package day07;

// #1. 클래스 정의
class Tv{
	boolean power = false;
	int vol = 0, ch =1;
    
}

public class Test62 {
int abc = 100;
void sleep() {
	System.out.println("졸려요");
}
	public static void main(String[] args) {
		Test62 test = new Test62();
		// 2. 객체 생성
		System.out.println(test.abc);
		System.out.println(test.abc);
		 Tv t = new Tv();
		 test.sleep();
		//3. 사용
		 System.out.println(t.power);
		 System.out.println(t.vol);
		 System.out.println(t.ch);
		 
		 Tv t1 = new Tv();
		 Tv t2 = new Tv();
		 Tv t3 = new Tv();
		 Tv t4 = new Tv();
		 System.out.println(t);
		 System.out.println(t1);
		 System.out.println(t2);
		 System.out.println(t3);
		 System.out.println(t4);
		 System.out.println("-----------");
		 t=t1;
		 System.out.println(t);
		 System.out.println(t1);
		 System.out.println(t2);
		 System.out.println(t3);
		 System.out.println(t4);
		 System.out.println("-----------");
		 
		 t1.ch=10;
		 t2.ch=20;
		 System.out.println(t1.ch);
		 System.out.println(t2.ch);
		 
		 //같은 타입끼리 대입 가능
		 int a =10;
		 int b = 20;
		 a=b;
		 b=a;
		 
		 t1=t2;
		 t1=t2;
		 //가능 (같은 int 타입)
		 t1.ch=t2.ch;
		 //가능 (같은int타입)
		 a = t2.ch;
		 t1.ch = b;
		 t1.ch = t2.vol;
		 
	}

}
