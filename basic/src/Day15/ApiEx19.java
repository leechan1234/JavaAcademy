package Day15;

import java.util.Vector;

public class ApiEx19 {

	public static void main(String[] args) {
       
		//백터 객체 생성
		Vector<String> v =new Vector<>();
		
		v.add("hello");
		v.add("java");
		
		v.add("이제 곧");
		v.add("끝나요");
		
		System.out.println(v);
		v.add(0, "hahaha");
		System.out.println(v);
		//hahah들어갔는지 확인
		String s= v.get(0);
		System.out.println(s);
		v.remove("hello");
		System.out.println(v);
		
		
			
		}
	}


