import java.util.Scanner;

public class OverlapCircle{
	public static void Check_Overlap(int r, int DC) {	// DC : Distance between circles
		int radius = r*r;
		
		if(DC > radius) 
			System.out.println("두 원은 서로 겹치지 않습니다.");
		else 
			System.out.println("두 원은 서로 겹칩니다.");

	}
	
	public static int Check_Circles_Distance(int x1, int y1, int x2, int y2) {
		int sum = 0, x = 0, y = 0;
		if(x1 > x2)
			x = x1 - x2;
		else
			x = x2 - x1;
		
		if(y1 > y2)
			y = y1 - y2;
		else
			y = y2 - y1;
		
		sum = x*x + y*y;
		
		return sum;
	}
	
	public static void main(String[] args) {
		int Distance_Circles = 0;
		
		Scanner circle = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력 >>");
		int point1x = circle.nextInt();
		int point1y = circle.nextInt();
		int r1 = circle.nextInt();
		
		System.out.println("두번째 원의 중심과 반지름 입력 >>");
		int point2x = circle.nextInt();
		int point2y = circle.nextInt();
		int r2 = circle.nextInt();
		circle.close();
		
		Distance_Circles = Check_Circles_Distance(point1x, point1y, point2x, point2y);
		Check_Overlap(r1+r2, Distance_Circles);
	}
}
