package day12;
//오버라이딩으로 다형성 실현
class Shape{
 
	void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	@Override
	void draw() {
	System.out.println("Line");
	
	}
}
class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
public class Test124 {
	
	
	static void paint(Shape p) {
		p.draw();
	}
	

	public static void main(String[] args) {
		Shape start, last, obj; //첫객체, 마지막객체,임시변수
		  paint(new Line());
		  paint(new Rect());
		  paint(new Line());
		  paint(new Circle());
		  

	}

}
