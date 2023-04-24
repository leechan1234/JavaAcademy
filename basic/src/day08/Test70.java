package day08;
class Circle{
	int radius = 30;
}



public class Test70 {
	//객체생성 번거로우니 static으로 만듬)
		static void  plus(int num) {
			num += 1;
		}
    static void biggerPizza(Circle pizza) {
    	pizza.radius += 5;
    }
static void increase(int[] arr) {
	for(int i =0; i < arr.length; i++ ) {
		arr[i]++;
	}
}
	
	
	
	public static void main(String[] args) {
		// 배열
		int[] arr = {1,2,3,4,5};
		increase(arr);
		for(int a : arr) {
			System.out.println(a);
		}
		//객체 타입
		Circle pizza = new Circle();
		biggerPizza(pizza);
		System.out.println(pizza.radius);
		
		
		//기본타입
		int num = 10;
		plus(num);
		System.out.println(num);
		

	}

}
