package dya17;
//스레드 클래스 만들기 : Tread 상속받은 클래스 정의
class TimerThread extends Thread{
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(++n);
		}
	}
}


public class ThreadEx01 {

	public static void main(String[] args) {
      
		
	}

}
