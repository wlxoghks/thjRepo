import java.util.Scanner;

public class whlie002 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while (true) {
			System.out.printf("더할 첫 번쨰 숫자입력 : ");
			a = s.nextInt();
			
			System.out.printf("더할 두 번쨰 숫자입력 : ");
			b = s.nextInt();
		
		System.out.printf("%d+ %d= %d \n", a, b, a+b );
		}

	}

}
