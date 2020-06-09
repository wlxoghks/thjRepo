import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArratList_1 {

	public static void main(String[] args) {
		
		Set<String> rList = new HashSet<String>();
		
		rList.add("°´Ã¼ÁöÇâÇÁ·Î±×·¥");
		rList.add("ÇÏµÓ");
		rList.add("MongoDB");
		
		
		Iterator<String> it = rList.iterator();
		
		while(it.hasNext());{
		
			String name = it.next();
		if (name.equals("ÇÏµÓ")) {
			System.out.println("<" + name+ ">");
		
			
		}else {
			System.out.println(name);
		}
		
		}
	}

}
