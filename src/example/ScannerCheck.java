package example;

import java.util.Scanner;

public class ScannerCheck {
	
	public static void main(String[] args) {
		
		System.out.println("���� ���� ù���� ������ �ι�° ������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		int fnum = scanner.nextInt();
		
		int Snum = scanner.nextInt();
		
		System.out.println(fnum + "�� " + Snum + "�� ����? " + (fnum + Snum));
		
		scanner.close();
	}

	
}
