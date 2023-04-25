package day10;
// 상속을 이용하여 아래 클래스들을 간결한 구조로 변경해보세요
class Pen{
	private int amount;
	public int getAmount() { return amount;}
	public void setAmount(int amount) { this.amount = amount;}
}


class SharpPencil extends Pen{
	private int width;
}
class Sub extends SharpPencil{
	int width = 180;
	int amount = 70;
}

class BallPen{
	private int amount;
	private String color;
	public int getAmount( ) { return amount;}
	public void setAmount(int amount) { this.amount = amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
}

class FountainPen{
	private int amount;
	private String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) { this.amount =amount;}
	public String getColor() { return color;}
	public void setColor(String color) {this.color = color;}
	public void refill(int n) { amount = n;}
}
public class Test103 {

	public static void main(String[] args) {
		
		
		

	}

}
