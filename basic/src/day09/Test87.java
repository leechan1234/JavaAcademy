package day09;

class Circle2{
	int radius;
	
	Circle2(int r){
		radius = r;
	} 
	//매개변수 없는 버전으로 객체 생성하고 싶으면
	//개발자가 직접 추가해줘야함.
	Circle2(){
		
	}
	void setRadius(int r) {
		radius = r;
	
//	}
//	double getArea() {
//		return radius * radius * 
//	}
	

}

//public class Test87 {
//
//	public static void main(String[] args) {
//		
////			Circle2 c = new Circle2(); 기본 생성자로 생성 불가
//		Circle2 c = new Circle2(5);
//		Circle2 c1 = new Circle2(5);
//		System.out.println(c.getArea());
//		System.out.println(c1.getArea());
//		
//	}
//
//}
