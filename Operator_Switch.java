import java.util.Scanner;

public class Operator_Switch{
	
	public static void main(String[] args) {
		double result = 0;
		
		Scanner operate = new Scanner(System.in);
		System.out.println("연산>>");
		
		double a = operate.nextDouble();
		String operators = operate.next();
		double b = operate.nextDouble();
		
		operate.close();
		
		switch(operators) {
		case "+":
			result = a + b;
			System.out.println(a + "+" + b + "의 계산 결과는 " + result);
			break;
			
		case "-":
			result = a - b;
			System.out.println(a + "-" + b +"의 계산 결과는 " + result);
			break;
			
		case "*":
			result = a * b;
			System.out.println(a + "*" + b +"의 계산 결과는 " + result);
			break;
			
		case "/":
			result = a / b;
			System.out.println(a + "/" + b +"의 계산 결과는 " + result);
			break;
		default:
			System.out.println("연산자를 잘못 입력하였습니다.");
			break;
		}
	}
}
