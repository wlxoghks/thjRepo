
public class break01 {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i <= 100; i++) {
			System.out.println("for문을 " + i + "번 실행했습니다");
			if(i==68) {
				break;
			}
		}
System.out.println("시스템종료.");;
	}

}
