// 가위바위보 게임, '그만' 을 입력하면 게임 종료.
import java.util.Scanner;

public class Quiz2_RockPaperScissors{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String command, computer;
		int quit = 0;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true){
			System.out.println("가위 바위 보!!>>");
			command = scanner.next();
			computer = "가위";		// 컴퓨터가 '가위'를 내도록 설정
			switch(command) {
			case "가위":
				System.out.println("사용자: " + command + ", 컴퓨터 = " + computer + ", 비겼습니다.");
				break;
			case "바위":
				System.out.println("사용자: " + command + ", 컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
				break;
			case "보":
				System.out.println("사용자: " + command + ", 컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
				break;
			case "그만":
				System.out.println("게임을 종료합니다...");
				quit = 1;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			if(quit == 1)
				break;	
		}
		scanner.close();
	}
	
}
