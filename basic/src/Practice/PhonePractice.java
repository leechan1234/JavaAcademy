package Practice;

class Phone{
	String name;
	String color;
	String company;

	
	void call() {
		System.out.println("전화를 건다");
	}
	void receive() {
		System.out.println("전화를 받다");
	}
}

class SmartPhone extends Phone{
	public void installApp() {
		System.out.println("앱 설치");
	}
}

	public class PhonePractice {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.color = "하양";
		p.company ="현대";
		System.out.println(p.name);
		System.out.println(p.color);
		System.out.println(p.company);
		SmartPhone s = new SmartPhone();
		System.out.println("--------------------------");
		s.name = "스마트폰";
		s.color = "검정";
		s.company = "삼성";
		System.out.println(s.color);
		System.out.println(s.name);
		System.out.println(s.company);
		s.call();
		s.receive();
		s.installApp();

	}

}
