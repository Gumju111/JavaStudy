package chapter4;
import java.util.Scanner;

class Book3 {
	String titile, author;
	
	public Book3(String title, String author) {	// ������
		this.titile = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book3 [] book = new Book3[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {	// book3.length = 2
			System.out.print("����>>");
			String title = scanner.nextLine();
			
			System.out.print("����>>");
			String author = scanner.nextLine();
			book[i] = new Book3(title, author);	// �迭 ���� ��ü ����
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].titile + ", " + book[i].author + ")");
		
		scanner.close();
	}
}
