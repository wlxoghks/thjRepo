import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		
		System.out.println("1��° ���ڸ� �Է��ϼ��� : ");
		aa[0] = s.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ��� : ");
		aa[1] = s.nextInt();
		System.out.println("3��° ���ڸ� �Է��ϼ��� : ");
		aa[2] = s.nextInt();
		System.out.println("4��° ���ڸ� �Է��ϼ��� : ");
		aa[3] = s.nextInt();
		
		hap = aa[0]+ aa[1] + aa[2]+ aa[3];
		
		System.out.println("�հ�==>"+ hap);
	
	}
}
