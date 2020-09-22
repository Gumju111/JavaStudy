package chapter4;

public class ArrayPassingEx {
	static void replaceSpace(char a[]) {	// �迭 a�� ���鹮�ڸ� ','�� ����
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ')	// ���� ���ڸ� ','�� ����
				a[i] = ',';
	}
	
	static void printCharArray(char a[]) {	// �迭 a�� ���ڵ��� ȭ�鿡 ���
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);	// �迭 ���� ���� ���
		System.out.println();	// �迭 ���� ��� ��� �� �ٹٲ�
	}

	public static void main(String[] args) {
		char c[] = {'T', 'h', 'i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);	// ���� �迭 ���� ���
		replaceSpace(c);	// ���� ���� �ٲٱ�
		printCharArray(c);	// ������ �迭 ���� ���
	}

}
