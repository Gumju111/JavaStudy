package chapter5;

class Shape {	//���� Ŭ����
	public Shape next;	// �׸� 5-22�� �ڵ带 ���� �ʿ��� �κ�
	public Shape() { next = null;}	// �׸� 5-22�� �ڵ带 ���� �ʿ��� �κ�
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {	// �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {	// �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
 
class Circle extends Shape{
	public void draw() {	// �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();	// p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. ���� ���ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		// ���� ȣ����� ��� paint() �޼ҵ� ������ Shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line);	// Line�� �������̵��� draw() ����, "Line" ���
		paint(new Shape());	// Shape�� draw() ����. "Shape" ���
		paint(new Line());	// Line�� �������̵��� draw() ����, "Line" ���
		paint(new Rect());	// Rect�� �������̵��� draw() ����, "Rect" ���
		paint(new Circle());	// Circle�� �������̵��� draw() ����, "Circle" ���
	}

}
