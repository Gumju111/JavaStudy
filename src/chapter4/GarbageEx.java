package chapter4;

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Nomal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}

}
