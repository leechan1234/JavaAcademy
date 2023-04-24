package day08;

class TestEx{
	// 입력값x, 리턴값x
	void printHello() {
		for(int i = 0; i < 10; i++) {
			System.out.println("hello method");
		}
	}
	// 입력값x, 리턴값0
	int getTen() {
		System.out.println("getTen 호출됨!!!");
		return 10;
	}
	// 입력값0, 리턴값x
	void greeting(String name) {
		System.out.println("안녕하세요 " + name + "님!");
	}
	// 입력값0, 리턴값0 숫자 2개 받아 2개 합을 리턴
	int sum(int a, int b) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		int result = a+ b;
		return result;
		
	}
	
}

public class Test68 {

	public static void main(String[] args) {
		TestEx t = new TestEx();
		t.printHello();
	    int result =t.getTen();
		System.out.println(result);
		t.greeting("피카츄");
		int sum = t.sum(10, 20);
		System.out.println(sum);
		
		
	}

}
