import java.util.Scanner;

public class Operator{
	
	public static void main(String[] args) {
		double result = 0;
		Scanner operate = new Scanner(System.in);
		System.out.println("연산>>");
		double a = operate.nextDouble();
		String operators = operate.next();
		double b = operate.nextDouble();
		operate.close();
		
		if(operators.equals("+")) {
			result = a + b;
			System.out.println(a + "+" + b + "의 계산 결과는 " + result);
			
		}else if(operators.equals("-")) {
			result = a - b;
			System.out.println(a + "-" + b +"의 계산 결과는 " + result);
			
		}else if(operators.equals("*")) {
			result = a * b;
			System.out.println(a + "*" + b +"의 계산 결과는 " + result);
			
		}else if(operators.equals("/")) {
			result = a / b;
			System.out.println(a + "/" + b +"의 계산 결과는 " + result);
		}
		
	}
}
