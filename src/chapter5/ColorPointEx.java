package chapter5;

class Point{
	private int x, y;	// �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();	// Point Ŭ������ showPoint() ȣ��
	}
}
public class ColorPointEx {
	public static void main(String[] args) {

	}

}
