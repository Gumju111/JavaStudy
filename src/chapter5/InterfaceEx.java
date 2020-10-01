package chapter5;

interface PhoneInterface{		// �������̽� ����
	final int TIMEOUT = 10000;	// ��� �ʵ� ����
	void sendCall();			// �߻� �޼ҵ�
	void receiveCall();			// �߻� �޼ҵ�
	default void printlogo() {	// default �޼ҵ�
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {	// �������̽� ����
	// PhoneInterface�� ��� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮��������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	// �޼ҵ� �߰� �ۼ�
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
}
public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printlogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
