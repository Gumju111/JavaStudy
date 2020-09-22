package chapter4;
import java.util.Scanner;

class Book3 {
	String titile, author;
	
	public Book3(String title, String author) {	// 积己磊
		this.titile = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book3 [] book = new Book3[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {	// book3.length = 2
			System.out.print("力格>>");
			String title = scanner.nextLine();
			
			System.out.print("历磊>>");
			String author = scanner.nextLine();
			book[i] = new Book3(title, author);	// 硅凯 盔家 按眉 积己
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].titile + ", " + book[i].author + ")");
		
		scanner.close();
	}
}
