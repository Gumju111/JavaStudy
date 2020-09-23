package openChallenge;
import java.util.Scanner;

class Player{
	Scanner inputword = new Scanner(System.in);
	public String name;
	public String wordin;
	
	public String sayWord() {	// ����ڷκ��� �ܾ �Է¹޴� �޼ҵ�
		wordin = inputword.next();
		return wordin;
	}
	
	public boolean succeed(char lastChar) {
		if(lastChar == wordin.charAt(0))
			return true;
		else return false;
	}
}

public class WordGameApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "�ƹ���";	// ���α׷����� ù �ܾ� �������ֱ�
		
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?>>");
		int number = scanner.nextInt();
		
		Player[] play = new Player[number];
		
		for(int i=0; i<number; i++) {
			System.out.println("�������� �̸��� �Է��ϼ��� >> ");
			play[i] = new Player();	// �� �ڵ尡 ������ Null
			play[i].name = scanner.next();	// �Է¹��� �̸��� Player �迭�� �̸� �ʵ忡 ���� �����ϴ� �ڵ�
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		int i=0, j=0;
		while(true) {
			j = i % number;	// �����ձⰡ �� �ҿ� ������ ���� ���� ����
			int lastIndex = word.length()-1;
			char lastChar = word.charAt(lastIndex);
			
			System.out.println(play[i].name + " >> ");
			play[j].sayWord();
			boolean continuing = play[j].succeed(lastChar);
			if(continuing == false) {
				System.out.println(play[j].name + "�� �����ϴ�.");
				break;
			}
			word = play[j].wordin;
			i++;
		}
		
	}
}
