package day13;import javax.imageio.plugins.tiff.GeoTIFFTagSet;

class SingleT{
	//아래 두 변수는 싱글턴 안에 만들어진 변수라
	//사용할때는 마치 둘다 클래스 변수처럼 사용됨
	static int b = 1; // getInstance() 로 얻어오지 않고도 사용 가능하게 
	 int a = 100;		//getInstance()로
 	//싱글톤 만들기
	private static SingleT instance = new SingleT();
	private SingleT() {}
		public static SingleT getInstance() {
			return instance;
		}
		void func() {
			System.out.println("싱글톤 !!!");
		}
	}


public class Test140 {

	public static void main(String[] args) {
		//싱글톤은 외부에서 객체 생성 불가!
//		SingleT s =new SingleT();//객체생성 불가

			//사용법
		//객체 얻어오기
		SingleT s = SingleT.getInstance();
		SingleT s2 = SingleT.getInstance();
		//기능 사용하기
		s.func();
		//싱글톤의 인슽턴스 변수 사용
		System.out.println("s.a : "+ s.a);
		System.out.println("s2.a : "+ s2.a);
		s.a= 300;
		//다른 변수에 얻어오기
		System.out.println("s.a : "+ s.a);
		System.out.println("s2.a : "+ s2.a);
		System.out.println(SingleT.b);
		System.out.println(s.b);
		
		//똑같은 기능이니까 굳이 무분별한 new 연산자를 쓰지 않는다.
	}

}
