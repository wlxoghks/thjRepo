import java.awt.geom.Arc2D.Float;
import java.io.IOException;
import java.util.Scanner;

public class while003 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a, b = 0;
		char ch;

		while(true) {
		System.out.printf("����� ù ���� ���ڸ� �Է� : ");
		a = s.nextInt();
		System.out.printf("�����  �� ��° ���ڸ� �Է� : ");
		b = s.nextInt();
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		ch = (char)System.in.read();
		
		switch(ch) {
		case '+':
			System.out.printf("%d+ %d= %d �Դϴ�.\n", a, b, a+b); break;
		case '-':
			System.out.printf("%d- %d= %d �Դϴ�.\n", a, b, a-b); break;
		case '*':
			System.out.printf("%d* %d= %d �Դϴ�.\n", a, b, a*b); break;
		case '/':
			System.out.printf("%d/ %d= %d �Դϴ�.\n", a, b, a/b); break;
		case '%':
			System.out.printf("%d %% %d= %d �Դϴ�.\n", a, b, a% b); break;
			
		
		
		
		}		
		}
	}

}
