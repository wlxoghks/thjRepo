import java.util.Scanner;

public class aa2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap = 0, i;
		
		for(i= 0; i<=3; i++) {
			System.out.println(i+1 + "��° ���ڸ� �Է��ϼ��� : ");
			aa[i] = s.nextInt();
		}
		hap = aa[0]+aa[1]+aa[2]+aa[3];
		System.out.println("�հ�==>" + hap);
	}
}
