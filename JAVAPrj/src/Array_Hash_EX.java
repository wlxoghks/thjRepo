import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class Array_Hash_EX {

	public static void main(String[] args) {
		
		///HashMap�� �����ϱ� ���� List �÷��� ��ü�� �޸𸮿� ����
		List <HashMap<String, String>> rList = new ArrayList<>();
		
		//�ռ� ����� rList ������ ������  HashMap ��ü �޸𸮿� ����
		HashMap<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "����ȯ");
		pMap.put("email", "thj0923@");
		pMap.put("addr", "����");
		pMap.put("dept", "����");
		
		//����ȯ ������ ����� HashMap ��ü�� List ������ ����
		rList.add(pMap) ;
		
		//����ȯ ������������ ���� ���� HashMap ���� �޸𸮿��� ����
		pMap = null;
		
		//����ȯ ������ �����ϱ� ���� ���� HashMap ������ ���Ӱ� �޸𸮿� �ø�
		pMap = new HashMap<>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");
		pMap.put("dept", "�ð�");
		
		//����ȯ ������ ����� HashMap ������ List ��ü�� ����
		rList.add(pMap);
		
		//����ȯ ������������ ���� ����� ���� HashMap ���� �޸𸮿��� ����
		pMap = null;
		
		Iterator<HashMap<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();
		
			System.out.println("##########  �ݺ� ����!!! ##########");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
			
			// HashMap ���� �޸𸮿��� ����
			rMap = null;
			System.out.println("########## �ݺ���!!! ##########");
		}
	}

}
