import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();

		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("����ȯ");
		rList.add("��ȯ ��");
		rList.add("wlxoghks");
		rList.add("thj");
		
		//�迭ũ�� ���
		//�迭�� ũ�⸦ �˱� ������ while�̾ƴ϶� for���� ���
 		System.out.println("�迭�� ũ�� "+ rList.size());
		
		for (int i=0; i<rList.size(); i++) {
			System.out.println("["+i+"]���� �迭 ������ : "+rList.get(i));
		}
	
		//List�÷����� ���� �����͸� ������ �� for���� ���� �ʰ�, while���� ���°��� ������
		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
		String name = (String) it.next();
		
		System.out.println("�̸� : " +name);
		}
	}

}
