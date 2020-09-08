package example;
import java.util.Scanner;

public class GraingSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;	//key 값
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		switch (score/10) {
		case 10:	// score = 100
		case 9:		// score는 90~99
			grade = 'A';	// case 10. case 9의 경우 모두 실행
			break;
		case 8:	// score는 80~89
			grade = 'B';
			break;
		case 7:	// score는 70~79
			grade = 'C';
			break;
		case 6:	// score는 60~69
			grade = 'D';
			break;
			default:	// score는  59 이하
				grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다");
		
	}

}
