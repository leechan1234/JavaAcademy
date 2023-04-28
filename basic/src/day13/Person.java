package day13;

public class Person {
	void wake() {
		System.out.println("7시에 기상");
	}
	
class Anony{
	Person p = new Person() {
		void work() {
			System.out.println("출근~");
		}
		@Override
		void wake() {
			System.out.println("6시에 기상!!!");
			work();
		}
	};
	void func() {
	Person locallp = new Person() {
		void walk() {
			System.out.println("산책");
		}
	  void wake() {
		  System.out.println("7시에 기상");
		  walk();
	  }
	};
	
	localp.wake();
	}
}

	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.p.wake();

	}

}
