import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArratList_1 {

	public static void main(String[] args) {
		
		Set<String> rList = new HashSet<String>();
		
		rList.add("��ü�������α׷�");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		
		Iterator<String> it = rList.iterator();
		
		while(it.hasNext());{
		
			String name = it.next();
		if (name.equals("�ϵ�")) {
			System.out.println("<" + name+ ">");
		
			
		}else {
			System.out.println(name);
		}
		
		}
	}

}
