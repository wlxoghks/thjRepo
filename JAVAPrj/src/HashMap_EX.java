import java.util.HashMap;
import java.util.Map;

public class HashMap_EX {

	public static void main(String[] args) {
		Map<String, String> pMAp = new HashMap<>();
		
		pMAp.put("name","����ȯ");
		pMAp.put("email","thj0923@naver.com");
		pMAp.put("dept","������ �м���");
		
		System.out.println("---------------------");
		System.out.println(pMAp.get("name"));
		System.out.println(pMAp.get("email"));
		System.out.println(pMAp.get("dept"));
		System.out.println(pMAp.get("����"));
		System.out.println("---------------------");
		

	}

}
