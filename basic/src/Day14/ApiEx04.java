package Day14;

public class ApiEx04 {

	public static void main(String[] args) {
		
		//리터럴 방식
		String a ="hello";
		String b = "hello";
		System.out.println( a== b); //주소 비교
		System.out.println(a.equals(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println("-----------------");
		b = "test";
	   //객체 생성
		String c = new String("hello");
		String d = new String("hello");
		System.out.println( c == d);
		System.out.println(c.equals(d));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
	}

}
