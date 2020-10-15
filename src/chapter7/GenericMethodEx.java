package chapter7;

public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){	// T�� Ÿ�� �Ű������� ���׸� �޼ҵ�
		GStack<T> s = new GStack<T>();	// ���� a�� �ݴ�� ������ ���� GStack ����
		while (true) {
			T tmp;
			tmp = a.pop();	// ���� ���ÿ��� ��� �ϳ��� ����
			if (tmp == null)	// ������ �����
				break;	// �Ųٷ� ����� �۾� ����
			else
				s.push(tmp);	// �� ���ÿ� ��Ҹ� ����
		}
		return s;	// �� ������ ����
	}
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();	// Double Ÿ���� GStack ����
		
		for (int i=0; i<5; i++) {	// 5���� ��Ҹ� ���ÿ� push
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}
