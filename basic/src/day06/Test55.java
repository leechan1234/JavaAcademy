package day06;

public class Test55 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//for each : 바로 값을 꺼내서 변수에 담아준다.
		for(int a : arr) {
			System.out.println(a);
		}

	}

}
