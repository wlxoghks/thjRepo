import java.util.List;
import java.util.ArrayList;

public class arraylist {

	//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();

		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("����ȯ");
		rList.add("ȫ�浿");
		rList.add("��浿");
		rList.add("�Ӳ���");
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ�� "+ rList.size());
		
		for (int i=0; i<rList.size(); i++) {
			System.out.println("["+i+"]���� �迭 ������ : "+rList.get(i));
		}
	}

}
