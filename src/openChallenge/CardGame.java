package openChallenge;
import java.util.Scanner;
import java.util.Random;

public class CardGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);	// Random class�� 0-99������ ������ ������ �����Ѵ�.
			System.out.println("���� �����Ͽ����ϴ�. ���纸����");
			System.out.println("0-99");
			int i = 1;
			while(true) {	// ����ڰ� �������� 'n'�� �Է��ϱ� ������ �ݺ� ����.
				System.out.println(i + ">>");
				int input = scanner.nextInt();
				
				while(input != k) {
					if(input<k)
						System.out.println("�� ũ��");
					else if(input>k)
						System.out.println("�� �۰�");
					i++;
					break;
				}
				
				if(input == k) {
					System.out.println("�¾ҽ��ϴ�.");
					System.out.println("�ٽ��Ͻðڽ��ϱ�? (y/n) >>");
					
					if(scanner.next().equals("n")) {
						System.out.println("���� ���߱⸦ �����մϴ�.");
						System.exit(0);
					}
					else
						break;
				}
			}
		}
	}

}
