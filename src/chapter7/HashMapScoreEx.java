package chapter7;
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		// �̸��� ������ ������ HashMap �÷��� ����
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
			// var scoreMap = new HashMap<String, Integer>();�� ������ �ᵵ ��
		
		// 5���� ���� ����
		scoreMap.put("�谡��", 97);
		scoreMap.put("�����", 88);
		scoreMap.put("�峪��", 75);
		scoreMap.put("�ڴٴ�", 86);
		scoreMap.put("Ȳ���", 70);
		
		System.out.println("HashMap�� ��� ���� : " + scoreMap.size());
		
		// ��� ����� ���� ���. scoreMap�� ��� �ִ� ��� (key, value) �� ���
		Set<String> keys = scoreMap.keySet();	// ��� key�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator();	// set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator ����
		
		while(it.hasNext())	{
			String name = it.next();		// ���� Ű. �л��̸�
			int score = scoreMap.get(name);	// ���� �˾Ƴ���
			System.out.println(name + " : " + score);
		}
	}
}
