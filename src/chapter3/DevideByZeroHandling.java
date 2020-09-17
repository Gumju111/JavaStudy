package chapter3;
import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend = scanner.nextInt();	// ������ �Է�
			System.out.print("�������� �Է��Ͻÿ�:");
			int divisor = scanner.nextInt();	// ������ �Է�
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;	// �������� ������ �Ϸ� �� while �����
			}
			catch (ArithmeticException e) {	// ArithmeticException ���� ó�� �ڵ�
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		scanner.close();
	}

}
