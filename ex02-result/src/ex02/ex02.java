//��Ģ����
package ex02;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		int menu=0, num=0;
		Scanner sc= new Scanner(System.in);
		int result=0;
		outer:
			while(true) {
				System.out.println("1:+  2:* 3:/ 4:- 0:종료하시겠습니까? ");
				String tmp=sc.nextLine();
				menu=Integer.parseInt(tmp);
				
				if(menu==0) {
					System.out.println("0은 나가기");
					break;
				}
				else if(!(1<=menu && menu<=3)) {
					System.out.println("1부터 3을 입력하세요.");
					continue;
				}
				
				for(;;) {
					System.out.println("값을 입력하세요.");
					tmp=sc.nextLine();
					num=Integer.parseInt(tmp);
					
					
					if(num==0)
						break;
					
					if(num==99)
						break outer;
					
					switch(menu) {
					case 1:
						System.out.println("총값 = "+(result+=num));
						break;
					case 2:
						System.out.println("총값="+(result*=num));
						break;
					case 3:
						System.out.println("총값="+(result/=num));
						break;
					case 4:
						System.out.println("총값"+(result-=num));
						break;
					
					}
				}
				
			}
		System.out.println("총계산 값"+result+ "입니다");
		

	}

}
