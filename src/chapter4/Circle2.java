package chapter4;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2() {	// �Ű� ���� ���� ������
		radius = 1; name = "";	// �ʵ� �ʱ�ȭ
	}
	
	public Circle2(int r, String n) {	// �Ű� ������ ���� ������
		radius = r; name = n;	// �Ű� ������ �ʵ� �ʱ�ȭ
	}

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "�ڹ�����");	// ��ü ����. �������� 10����, �̸��� "�ڹ�����"�� �ʱ�ȭ
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle2 donut = new Circle2();	// ��ü ����. �������� 1, �̸��� ""�� �ʱ�ȭ
		donut.name = "��������";	// �̸� ����
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
