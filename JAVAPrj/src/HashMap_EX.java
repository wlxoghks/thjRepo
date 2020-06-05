import java.util.HashMap;
import java.util.Map;

public class HashMap_EX {

	public static void main(String[] args) {
		Map<String, String> pMAp = new HashMap<>();
		
		pMAp.put("name","지태환");
		pMAp.put("email","thj0923@naver.com");
		pMAp.put("dept","데이터 분석과");
		
		System.out.println("---------------------");
		System.out.println(pMAp.get("name"));
		System.out.println(pMAp.get("email"));
		System.out.println(pMAp.get("dept"));
		System.out.println(pMAp.get("오라"));
		System.out.println("---------------------");
		

	}

}
