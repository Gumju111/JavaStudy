package chapter8;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:/windows/system.ini");	// ���� �Է� ��Ʈ�� ����
			int c;
			while ((c = fin.read()) != -1) {	// �� ���ھ� ���� ������ �д´�.
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
