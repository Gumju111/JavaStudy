package openChallenge;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String name1;
		String name2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("���� >>");	// ���� �Է�
		name1 = scanner.nextLine();
		System.out.print("ö�� >>");	// ö�� �Է�
		name2 = scanner.nextLine();
		
		if(name1.equals("����")) {			// ����
			if(name2.equals("����")) 		// ö���� ������ ������
				System.out.println("�����ϴ�.");
			else if(name2.equals("����"))	// ö���� ������ ������
				System.out.println("ö���� �̰���ϴ�.");
			else if(name2.equals("��"))		// ö���� ���� ������
				System.out.println("���� �̰���ϴ�.");
		}// if
		if(name1.equals("����")) {			// ����
			if(name2.equals("����")) 		// ö���� ������ ������
				System.out.println("�����ϴ�.");
			else if(name2.equals("����"))	// ö���� ������ ������
				System.out.println("���� �̰���ϴ�.");
			else if(name2.equals("��"))		// ö���� ���� ������
				System.out.println("ö���� �̰���ϴ�.");
		}// if
		if(name1.equals("��")) {			// ����
			if(name2.equals("��"))			// ö���� ���� ������
				System.out.println("�����ϴ�.");
			else if(name2.equals("����"))	// ö���� ������ ������
				System.out.println("ö���� �̰���ϴ�.");
			else if(name2.equals("����"))	// ö���� ������ ������
				System.out.println("���� �̰���ϴ�.");
		}// if
		scanner.close();// �Է�����
	}// main()
}
 