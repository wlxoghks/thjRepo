import java.awt.geom.Arc2D.Float;
import java.io.IOException;
import java.util.Scanner;

public class while003 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a, b = 0;
		char ch;

		while(true) {
		System.out.printf("계산할 첫 번쨰 숫자를 입력 : ");
		a = s.nextInt();
		System.out.printf("계산할  두 번째 숫자를 입력 : ");
		b = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		ch = (char)System.in.read();
		
		switch(ch) {
		case '+':
			System.out.printf("%d+ %d= %d 입니다.\n", a, b, a+b); break;
		case '-':
			System.out.printf("%d- %d= %d 입니다.\n", a, b, a-b); break;
		case '*':
			System.out.printf("%d* %d= %d 입니다.\n", a, b, a*b); break;
		case '/':
			System.out.printf("%d/ %d= %d 입니다.\n", a, b, a/b); break;
		case '%':
			System.out.printf("%d %% %d= %d 입니다.\n", a, b, a% b); break;
			
		
		
		
		}		
		}
	}

}
