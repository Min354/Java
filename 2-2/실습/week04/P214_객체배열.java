package week04;
import java.util.Scanner;

class Book{
	String title;
	String author;
	void show() {System.out.println("(" + title + ", " + author + ")");}

	
	public Book(String title, String author) {this.title = title; this.author = author;}
}


public class P214_객체배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Book [] book = new Book[2];
		for(int i=0; i<book.length; i++) {
			System.out.print("Title: ");
			String title = s.next();
			System.out.print("Author: ");
			String author = s.next();
			
			book[i] = new Book(title, author);
		}
		for(int i=0; i<book.length; i++) {
			book[i].show();
		}
		
		
		s.close();

	}

}
