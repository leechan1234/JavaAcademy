package Practice;


class Excercise{
	private Excercise() {
		
	}
	private static Excercise getInstance() {
		return getInstance;
	}
}
public class Excercise9 {

	public static void main(String[] args) {
		 Excerise ex1 = Excercise.getInstance();
		 Excerise ex2 = Excercise.getInstance();
		 System.out.println("ex1 == ex2 : " + (ex1 == ex2));
		 
	}

}
