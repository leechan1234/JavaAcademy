package Practice;



public class Arr {

	public static void main(String[] args) {
	  int[] num1 = {1,2,3,4,5,6,7,8,9,10};
	  int[] num2 = new int[10];
	   for (int i = 0; i < num1.length; i++) {
		num2[i] = num1[i] * num1[i];
	}  
	  
	  
	  //num2 출력
	  for (int i = 0; i < num2.length; i++) {
		System.out.println(num2[i]);
	}
  }
	
}