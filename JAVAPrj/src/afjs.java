
import java.util.*;

public class afjs {

   public static void main(String[] args) {
     
   int i = 0, tot = 0 ; 
   
   int a[] = new int[90]; //for���� �迭�� ���� ������
   
    for (; i < 90; i++) {
    	
       a[i] = (i+10) +1;
       
       tot += a[i];		//tot�� ���� ������
       
    }
    i = 0;				//while���� ������ ���� �����
    
    while (i < 90) { 
    	
       System.out.println(a[i]);
       
       i++;
       
    }
    
    System.out.printf("��  : %d", tot);
    
   }

}