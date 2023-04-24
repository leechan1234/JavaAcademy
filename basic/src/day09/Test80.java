package day09;
//메서드 오버로딩
public class Test80 {
	static //성립
	int getSum(int a ,int b) {
		return a+ b;
	}
	static int getSum(int a, int b , int c) {
		return a + b+ c;
	}
	//성립
	int getMuk(int a, int b) {
		return a+ b;
	}
	int getMul(int a, double b) {
		return a*(int) b;
	}
	
//	int getSub(int a , int b) {
//		return a - b;
//	}
//	double getSub(int a , int b) {
//		return (double) a- b;
//	}
	int getDiv(int a , int b) {
		return a/b;
	}
	int getDiv(double c , int d) {
		return (int)c/d;
	}
	public static void main(String[] args) {
		int result = getSum(10, 20);
	 System.out.println(result);
	 int res = getSum(1,2,3);
	 System.out.println(res);

	}

}
