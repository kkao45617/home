package ex01;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
	      int sum=0;
	      Scanner scanner = new Scanner(System.in);
	      Scanner scanner2 = new Scanner(System.in);
	      
	      
	      while(true){
	         System.out.println("�����Է�");
	         System.out.println("��Ģ�Է�(����:x)");
	         int tmp = scanner.nextInt();
	         String tmp2 = scanner2.nextLine();
	         
	         if(tmp2.equals("*")) 
	            sum=sum*tmp;
	         if(tmp2.equals("-"))
	            sum=sum-tmp;
	         if(tmp2.equals("+"))
	            sum=sum+tmp;
	         if(tmp2.equals("/"))
	            sum=sum/tmp;
	         if(tmp2.equals("x"))
	            break;

	         System.out.println(sum);
	         continue;   
	   }
	      System.out.println("����Ǿ����ϴ�");

	}

}
