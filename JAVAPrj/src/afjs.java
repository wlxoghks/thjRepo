
import java.util.*;

public class afjs {

   public static void main(String[] args) {
     
   int i = 0, tot = 0 ; 
   
   int a[] = new int[90]; //for문은 배열의 값을 저장함
   
    for (; i < 90; i++) {
    	
       a[i] = (i+10) +1;
       
       tot += a[i];		//tot은 값을 보여줌
       
    }
    i = 0;				//while문은 저장한 값을 출력함
    
    while (i < 90) { 
    	
       System.out.println(a[i]);
       
       i++;
       
    }
    
    System.out.printf("합  : %d", tot);
    
   }

}