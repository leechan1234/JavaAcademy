package day13;

class MyException extends Exception{
p	public MyException() {}
	public MyException(String msg) {
		super(msg); //MyException에 있는 메세지 매개변수 생성자 실행시킴
	}
}


public class test148 {
	
	static void method1() throws Exception {
		try {
			method2();
			
		} catch (Exception e) {
			System.out.println("method1에서 예외 처리 후 던지기");
			throw e;
		}
	}

	static void method2() throws Exception {
		throw new Exception("method2에서 예외 발생 ");
	}


	public static void main(String[] args) {
		 try {
			 method1();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
