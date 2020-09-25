import java.util.Scanner;
import java.util.InputMismatchException;

public class Concert_Reservation_System{
	
	public static class Seat{
		String[] Seat_array;
		
		public Seat() {			// 생성자
			Seat_array = new String[10];
			for (int i=0; i<10; i++) {
				this.Seat_array[i] = "---";
			}
		}
		
		public int Reservation(int Seat_Number, String name) {		// 좌석을 예약하기 위한 메소드
			if(Check_person(name) == 0) {
				return 0; 			// 비정상 종료
			}else if (Seat_Number < 0 || Seat_Number >= 10) {
				System.out.println("알맞은 범위의 수를 입력하세요 (1~10).");
				return 0;			// 비정상 종료.
			}
			
			if(Seat_array[Seat_Number] != "---")
				System.out.println("이미 예약된 좌석입니다. 다른 번호를 입력해주세요.");
			else
				Seat_array[Seat_Number] = name;
			
			return 1;
		}
		
		public int Cancel_Reservation(String name) {				// 예약을 취소하기 위한 메소드
			for (int i = 0; i<10; i++) {
				if(Seat_array[i].equals(name)) {
					Seat_array[i] = "---";
					return 1;		
				}
			}
			
			System.out.println("예약된 이름이 없습니다.");
			return 0;			// 비정상 종료
		}
		
		public int Check_person(String name) {						// 이미 예약되어 있는 이름인지 확인하기 위한 메소드
			for(int i=0; i<10; i++) {
				if(Seat_array[i] == name) {
					System.out.println("이미 예약되어 있는 이름입니다.");
					return 0;
				}
			}
			return 1;
		}
		public void Print_list() {
			for (int i=0;i<10;i++)
				System.out.print(Seat_array[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Seat S, A, B;
		A = new Seat();
		B = new Seat();
		S = new Seat();
		int Seat_Number = 0, quit = 0;			// 예약할 때 좌석 번호를 입력하기 위한 Seat_Number, 반복문을 벗어나기 위한 quit
		int Seat_Segregation_number = 0;
		String name;					// 예약, 예약 취소를 할때 입력할 이름

		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			int command = scanner.nextInt();
			
			switch(command) {
			case 1:		// 예약
				try {
					System.out.print("좌석구분 S(1), A(2), B(3) >>");
					Seat_Segregation_number = scanner.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					System.out.print("좌석구분 S(1), A(2), B(3) >>");
					Seat_Segregation_number = scanner.nextInt();
				}
				switch(Seat_Segregation_number) {
				case 1:		// S 좌석
					System.out.print("S>> ");
					S.Print_list();
					
					System.out.print("\n이름>>");
					name = scanner.next();
					try{
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					S.Reservation(Seat_Number - 1, name);
					break;
				case 2:		// A 좌석
					System.out.print("A>> ");
					A.Print_list();
					
					System.out.print("\n이름>>");
					name = scanner.next();
					try{
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					A.Reservation(Seat_Number - 1, name);
					break;
				case 3:		// B 좌석
					System.out.print("B>> ");
					B.Print_list();

					System.out.print("\n이름>>");
					name = scanner.next();
					try{
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						System.out.print("번호>>");
						Seat_Number = scanner.nextInt();
					}
					B.Reservation(Seat_Number - 1, name);
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					break;
				}
				break;
				
			case 2:		// 조회
				System.out.print("S>> ");
				S.Print_list();
				System.out.print("\nA>> ");
				A.Print_list();
				System.out.print("\nB>> ");
				B.Print_list();
				System.out.println("\n<<< 조회를 완료하였습니다. >>>");
				break;
				
			case 3:		// 취소
				try {
					System.out.print("좌석구분 S(1), A(2), B(3) >>");
					Seat_Segregation_number = scanner.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					System.out.print("좌석구분 S(1), A(2), B(3) >>");
					Seat_Segregation_number = scanner.nextInt();
				}
				switch(Seat_Segregation_number) {
				case 1:
					System.out.print("S>> ");
					S.Print_list();
					
					System.out.print("\n이름>>");
					name = scanner.next();
					S.Cancel_Reservation(name);
					break;
				case 2:
					System.out.print("A>> ");
					A.Print_list();
					
					System.out.print("\n이름>>");
					name = scanner.next();
					A.Cancel_Reservation(name);
					break;
				case 3:
					System.out.print("B>> ");
					B.Print_list();

					System.out.print("\n이름>>");
					name = scanner.next();
					B.Cancel_Reservation(name);
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					break;
				}
				break;
				
			case 4:	// 종료
				System.out.println("시스템을 종료합니다.");
				quit = 1;
				break;
			}
			
				
			if(quit == 1)
				break;
		}
		scanner.close();
	}
}
