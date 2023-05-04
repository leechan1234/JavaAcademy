package Day14;

public class ApiEx05 {

	public static void main(String[] args) {
		
		String str = new String("java");
		System.out.println(str);
		
	String newStr=str.concat("hello");
	System.out.println(newStr);
	
	/////////////////////////////////////
	
	String java = "Java";
	String cpp = "C++";
	
	int a =java.compareTo(cpp);
	System.out.println(a);
	/////////////////////////////////////
		String aa = "             abcd   efg         ";
		String bb = "             abcd\t";
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(aa.trim());
		System.out.println(bb.trim());
		///////////////////////////
		String s = "class";
		char ch = s.charAt(0);
		System.out.println(ch);
		
		//문자열의 "s"의 개수 알아내기
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'S') {
				
			}
			System.out.println(count);
			
		}
//		String str = "asdd;as;asdkasskpskposskdp";
//		System.out.println(str.length());
//		
//		boolean result = str.contains("f");
//		System.out.println(result);
//		
//		////////////////////////////////
//		str = "Apple Tree";
		
		
//		Str = str.replace("Apple" , "Lemon");
		
		str = "100";
		//문자열 -> 정수
		int strInt = Integer.parseInt(str);
		// 정수 -> 문자열
		 int num = 100;
		 String s1 =String.valueOf(num);
		 System.out.println(s1);
		 
		 int number = 200;
		 String ss = number +"";
		 System.out.println(ss);
		
		
	}

}
