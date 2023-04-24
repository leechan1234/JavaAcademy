package day07;

class TvTest{
//	static int x = y;
//	int y = 20;
	
	static int x =100;
	int y = x;
	
}

public class Test64 {
	static int a =123;
	int b =50;
	public static void main(String[] args) {
    System.out.println(TvTest.x);
    TvTest tv = new TvTest();
    System.out.println(tv.y);
    System.out.println(Test64.a);
    
    Test64 t = new Test64();
    System.out.println(t.b);
	
    System.out.println(new Test64().b);//단발성

	}

}
