package day08;
class MobilePhone {
	double width;
	double height;
	double tick;
	String phoneColor="";
	String phoneBrand="";
}

class GlovalStudent{
	String name;
	String color;
}









public class Test_03 {

	public static void main(String[] args) {
		GlovalStudent j = new GlovalStudent();
		j.name = "lch";
		j.color = "black";
		System.out.println(j.name);
		System.out.println(j.color);
		MobilePhone m = new MobilePhone();
		m.width=7.5;
		m.height=9.5;
		m.tick=1.5;
		m.phoneColor="하얀색";
		m.phoneBrand="Skt";
		System.out.println("가로길이 : " + m.width + "cm");
		System.out.println("세로길이 : " + m.height + "cm");
		System.out.println("두께 : " + m.tick + "cm");
		System.out.println("폰 색상 : " + m.phoneColor);
		System.out.println("폰 브랜드 : " + m.phoneBrand);
	}

}
