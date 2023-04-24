package day08;
// Tv 클래스
// 값저장 : 채널, 볼륨 , 전원
//기능 : 전원 on/off, 볼륨 조절 , 채널조정 , 채널입력

import java.util.Scanner;

class Tv{
	int ch =1, vol = 0;  
	boolean power = false;
	
	void OnOff() {
		power =! power;
	}
	void chUp() {
		ch++; 
	}
	// chDown(), volUp(), volDown()...
	void chDown() {
		ch--;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	
	void changeCh(int num) {
		ch = num;
	}
}
public class Test67 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.power);
		tv.OnOff();
		System.out.println(tv.power);
		tv.changeCh(20);
		System.out.println(tv.ch);
		

	}

}
