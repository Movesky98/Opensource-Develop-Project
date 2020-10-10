import java.util.Scanner;
import java.io.IOException;

class Person_ {
	private int num1, num2, num3;
	public String name;
	public Person_(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		
		if(num1 == num2 && num2 == num3)
			return true;
		else 
			return false;
	}
}
public class Gambling_Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person_[] person = new Person_[2];
		for(int i=0; i<2; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name = scanner.next();
			person[i] = new Person_(name);
		}
		System.out.println("");
		while(true) {
			for(int i=0; i<2; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				try{
					System.out.println("");
					if(System.in.read() == 13) {
						System.in.read();
						if(person[i].game()) {
						System.out.println(person[i].name+"님이 이겼습니다!");
						scanner.close();
						return;
						}
						System.out.println("아쉽군요!");
					}
					else {
						System.in.read();
						System.out.println("엔터를 입력해주세요.");
					}
				}
				catch(IOException e){
					System.out.println("제대로 입력해주세요.");
				}
			}
		}
	}
}
