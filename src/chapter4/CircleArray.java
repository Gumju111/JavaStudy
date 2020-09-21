package chapter4;

class Circle3{
	int radius;
	public Circle3(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle3 [] c;	// Circle �迭�� ���� ���۷��� c ����
		c = new Circle3[5];	// 5���� ���۷��� �迭 ����
		
		for(int i = 0; i<c.length; i++)	// �迭�� ���� ��ŭ
			c[i] = new Circle3(i);	// i ��° ���� ��ü ����
		
		for(int i=0; i<c.length; i++)	// �迭�� ��� Circle ��ü�� ���� ���
			System.out.print((int)(c[i].getArea()) +" ");
	}
}
