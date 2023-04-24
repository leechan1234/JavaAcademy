package day07;

class TvEx{
	//클래스 변수 : 클래스명.변수명(TvEx.power)
	static boolean power = false;
	//인스턴스 변수 : 클래스 바로 안에 선언 : 객체 생성 후, 참조변수명.변수명
	int vol = 0, ch = 1;
}
public class Test63 {

	public static void main(String[] args) {
		//지역변수 : 메서드 안에서 만든 변수(선언된 영역에서만 사용 가능) 
		int abc = 10;
		   //지역 변수 : for문 영역안에서 만들어져 for안에서만 사용가능
//			for(int i =0; i < 5; i++) {
//				System.out.println("hello");
//			}
		
		System.out.println(TvEx.power);
		TvEx tv = new TvEx();
		System.out.println(tv.ch);
		System.out.println(tv.vol);
		
		TvEx tv1 = new TvEx();
		TvEx tv2 = new TvEx();
		TvEx.power = true;
		tv1.ch=200;
		System.out.println(tv1.power + " " + tv1.ch);
		System.out.println(tv2.power + " " + tv2.ch);
	}

}
