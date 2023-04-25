package day10;

//default 클래스


class Sample{
	public int a;
	private int b;
	int c;
	protected int d;
}
public class Test100 {
 public static void main(String[] args) {
	 	Sample s = new Sample();
	 	s.a = 10;
	 	//s.b=20; 접근불가
	 	s.c = 30;
	 	s.d = 40;
	}

}
