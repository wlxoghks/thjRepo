import java.util.Scanner;

public class whlie002 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while (true) {
			System.out.printf("���� ù ���� �����Է� : ");
			a = s.nextInt();
			
			System.out.printf("���� �� ���� �����Է� : ");
			b = s.nextInt();
		
		System.out.printf("%d+ %d= %d \n", a, b, a+b );
		}

	}

}
