import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		
		System.out.println("1번째 숫자를 입력하세요 : ");
		aa[0] = s.nextInt();
		System.out.println("2번째 숫자를 입력하세요 : ");
		aa[1] = s.nextInt();
		System.out.println("3번째 숫자를 입력하세요 : ");
		aa[2] = s.nextInt();
		System.out.println("4번째 숫자를 입력하세요 : ");
		aa[3] = s.nextInt();
		
		hap = aa[0]+ aa[1] + aa[2]+ aa[3];
		
		System.out.println("합계==>"+ hap);
	
	}
}
