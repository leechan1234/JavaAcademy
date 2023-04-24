package day09;

class Car{
	String color= " ";
	Car(String color){
		this.color = "colors";
	}
	String drive() {
		return color + "색 차가 지나 갑니다 ~ 비키세요~~";
	}
}

public class Test90 {

	public static void main(String[] args) {
		//객체 배열
//		int[]nums = new int[5];
		Car[]cars = new Car[5]; // Car 객체 5개 저장할 수 있는 차고
		String[] colors = {"빨간","노란","파랑","검은","흰"};
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(colors[i]); //객체생성해 배열에 담기
		}
		for (int j = 0; j < cars.length; j++) {
			
			System.out.println(cars[j].drive());
		}

	}

}
