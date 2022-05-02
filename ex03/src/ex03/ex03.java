//구구단
package ex03;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("구구단");
	int tmp= sc.nextInt();
	
	sub(tmp);

	
	}
	public static void sub(int i) {
		
		for(int j=1; j<10; j++) {
			System.out.println(i*j);
		}

	

	}

}
