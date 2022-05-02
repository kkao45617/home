//배열 옮겨담기
package ex05;
import java.util.*;


public class ex05 {

	public static void main(String[] args) {
		int a[]=new int[5];
		for(int i=0; i<a.length;i++) {
			a[i]=(int)(Math.random()*100);

		}
		
		System.out.println(Arrays.toString(a));
		
		int max=0;
		int min= a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		System.out.println("-----------");
		
		int b;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
			
		}
		System.out.print(Arrays.toString(a));
			
		
	}


}
