import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[99];
		int hap= 0, i;
		
		for (i=0; i<=100; i++) {
		System.out.println( i+1 +"��° ���ڸ� �Է��ϼ��� : ");
		aa[i] = s.nextInt();
		}
		for(i=0; i<100; i++) {
			hap = hap+aa[i];
		}
		
		
		System.out.println("�հ�==> "+ hap);
	
	}
}
