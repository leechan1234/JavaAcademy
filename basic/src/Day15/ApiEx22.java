package Day15;

import java.util.ArrayList;

public class ApiEx22 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		arr.add(3,10);
		
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		arr1.add(60);
		
		arr.addAll(arr1);
		
		arr.remove(3);
	
			
		System.out.println(arr.get(4));
	}

}
