package day12;

//아래 추상 클래스 Calc를 상속받은 MyCalc 클래스를 구현하세요.
abstract class Calc{
	public abstract  int add(int a, int b);  
	public abstract  int substract(int a, int b);
	public abstract  double average(int[] a); //평균값 리턴
}
class MyCalc extends Calc{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		
		return a-b;
	}

	@Override
	public double average(int[] a) { // ={1,2,3,4,5};
	
 		int tot = 0;
		for (int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		double avg =(double)tot / a.length;
		return avg;
	}

	
}

public class Test126 {

	public static void main(String[] args) {
		 
		//MyCalc 사용 코드 작성
		
		MyCalc m = new MyCalc();
		System.out.println(m.add(20, 20));
		System.out.println(m.substract(5, 2));
		//int [] arr ={1,2,3,4,5}
		System.out.println(m.average(new int[] {1,2,3,4,5,6,7,8,9,10}));
	
		
		
	}

}
