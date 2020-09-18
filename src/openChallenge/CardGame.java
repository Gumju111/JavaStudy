package openChallenge;
import java.util.Scanner;
import java.util.Random;

public class CardGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);	// Random class로 0-99까지의 임의의 정수를 생성한다.
			System.out.println("수를 결정하였습니다. 맞춰보세요");
			System.out.println("0-99");
			int i = 1;
			while(true) {	// 사용자가 마지막에 'n'을 입력하기 전까지 반복 실행.
				System.out.println(i + ">>");
				int input = scanner.nextInt();
				
				while(input != k) {
					if(input<k)
						System.out.println("더 크게");
					else if(input>k)
						System.out.println("더 작게");
					i++;
					break;
				}
				
				if(input == k) {
					System.out.println("맞았습니다.");
					System.out.println("다시하시겠습니까? (y/n) >>");
					
					if(scanner.next().equals("n")) {
						System.out.println("숫자 맞추기를 종료합니다.");
						System.exit(0);
					}
					else
						break;
				}
			}
		}
	}

}
