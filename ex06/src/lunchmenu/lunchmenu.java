package lunchmenu;
//3자리 정수 암산 프로그램
import java.util.*;
public class lunchmenu {

	public static void main(String[] args) {
		System.out.println("암산하자");
		Scanner sc=new Scanner(System.in);
		int retry=0;
		
		do {
			int x= (int)(Math.random()*100);
			int y= (int)(Math.random()*100);
			int z= (int)(Math.random()*100);
			
			int num=(int)(Math.random()*4+1);
			
			int answer=0;
			
			switch(num) {
			case 0: answer=x+y+z; break;
			case 1: answer=x+y-z; break;
			case 2: answer=x-y+z; break;
			default: answer=x-y-z; break;
				
			}
			
			while(true) {
				System.out.println(x+((num<2 )? "+":"-")+
								   y+((num % 2==0)?"+":"-")+
								   z+"=");
			int an=sc.nextInt();
			if(an==answer) 
			
			break;
			System.out.println("오답입니다");
			
			
			
			}
			System.out.println("정답입니다.");
			System.out.println("계속(1) 정지(0)");
			retry=sc.nextInt();
			sc.nextLine();
		}while(retry==1);
		
		System.out.print("프로그램 종료");
	}

}
