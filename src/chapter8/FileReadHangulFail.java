package chapter8;
import java.io.*;

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");	// ���Ϸκ��� ����Ʈ �Է� ��Ʈ�� ����
			
			in = new InputStreamReader(fin, "US-ASCII");
			
			int c;
			
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());	// �������� ���
			while ((c = in.read()) != -1) {	// ���� ������ �д´�.
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}	catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
