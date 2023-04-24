package day09;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	Book3(String title, String author){
		  this.title = title;
		  this.author = title;
		  
	}
}


public class Test91 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	     Book3[] books = new Book3[2]; // Book3 타입 객체 배열 생성
	     for (int j = 0; j < books.length; j++) {
	    	 System.out.println("책 제목 : ");
		     String t1 = scanner.nextLine();
		     System.out.println("저자 : ");
		     String a1 = scanner.nextLine();
		     //입력받은 값으로 책 만들고
		   //배열에 저장
		     books[j] = new Book3(t1, a1);
		}   
	     for (int i = 0; i < books.length; i++) {
	    	 System.out.println(books[i].title + " " + books[i].author);
			
		}
	     
//	     Book3 b1 = new Book3("A","AA");
//	     books[0] = b1;
//	     Book3 b2 = new Book3("b","bb");
//	     books[1] = b2;
//	       
	  
	    }
	}
