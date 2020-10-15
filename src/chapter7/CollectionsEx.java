package chapter7;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {	// ����Ʈ�� ��Ҹ� ��� ����ϴ� �޼ҵ�
		Iterator<String> iterator = l.iterator();	// Iterator ��ü ����
		while (iterator.hasNext()) {	// Iterator ��ü�� ��Ұ� ���� ������ �ݺ�
			String e = iterator.next();	// ���� ��� ����
			String separator;
			if (iterator.hasNext())
				separator = "->";	// ������ ��Ұ� �ƴϸ� -> ���
			else
				separator = "\n";	// ������ ����̸� �ٹٲ�
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();	// �� ����Ʈ ����
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		Collections.sort(myList);	// ��� ����
		printList(myList);	// ���ĵ� ��� ���
		
		Collections.reverse(myList);	// ����� ������ �ݴ�� ����
		printList(myList);	// ��� ���
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") +1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}
}
