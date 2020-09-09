package openChallenge;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String name1;
		String name2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("영희 >>");	// 영희 입력
		name1 = scanner.nextLine();
		System.out.print("철수 >>");	// 철수 입력
		name2 = scanner.nextLine();
		
		if(name1.equals("가위")) {
			if(name2.equals("가위")) 
				System.out.println("비겼습니다.");
			else if(name2.equals("바위")) 
				System.out.println("철수가 이겼습니다.");
			else if(name2.equals("보")) 
				System.out.println("영희가 이겼습니다.");
		}
		if(name1.equals("바위")) {
			if(name2.equals("바위")) 
				System.out.println("비겼습니다.");
			else if(name2.equals("가위")) 
				System.out.println("영희가 이겼습니다.");
			else if(name2.equals("보")) 
				System.out.println("철수가 이겼습니다.");
		}
		if(name1.equals("보")) {
			if(name2.equals("보"))
				System.out.println("비겼습니다.");
			else if(name2.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if(name2.equals("바위"))
				System.out.println("영희가 이겼습니다.");
		}
		scanner.close();
	}

}
 