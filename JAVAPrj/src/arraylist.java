import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	//List 인터페이스는 메모리에 올릴 수 없기 떄문에 ArrayList 클래스를 통해 메모리를 올림
	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();

		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("지태환");
		rList.add("태환 지");
		rList.add("wlxoghks");
		rList.add("thj");
		
		//배열크기 출력
		//배열의 크기를 알기 때문에 while이아니라 for문을 사용
 		System.out.println("배열의 크기 "+ rList.size());
		
		for (int i=0; i<rList.size(); i++) {
			System.out.println("["+i+"]번쨰 배열 기억공간 : "+rList.get(i));
		}
	
		//List컬렉션을 통해 데이터를 가져올 때 for문을 쓰지 않고, while문을 쓰는것을 권장함
		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
		String name = (String) it.next();
		
		System.out.println("이름 : " +name);
		}
	}

}
