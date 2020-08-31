package example;

import java.util.Scanner;

public class ScannerCheck {
	
	public static void main(String[] args) {
		
		System.out.println("합을 구할 첫번쨰 정수와 두번째 정수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int fnum = scanner.nextInt();
		
		int Snum = scanner.nextInt();
		
		System.out.println(fnum + "와 " + Snum + "의 합은? " + (fnum + Snum));
		
		scanner.close();
	}

	
}
