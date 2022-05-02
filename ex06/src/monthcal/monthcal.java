package monthcal;
import java.util.*;
//해당 월의 영어 단어를 입력하는 프로그램
public class monthcal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] monthString= {"january","febraury","march","april","may","june","nuly","agust","september"
		,"october","nomember","december"		
		};
		
		System.out.println("해당 월의 영어 단어를 입력하세요");
		System.out.println("첫 글자 대문자, 그 이후는 소문자로 입력");
		
		int retry=0;
		int last=-1;
		int a=0;
		loop:
		do {
	
			int month=(int)(Math.random()*12);
			if(month==a) {
				month=0;
				continue;
			}
			
			System.out.println(month+1);
			while(true) {
				
				System.out.print((month+1)+"월");
				String qus=sc.nextLine();
				
				if(qus.equals(monthString[month])) break; //정답
				System.out.println("오답입니다.");
				
			}
			System.out.println("정답입니다. 재도전(1): 그만 (0)");
			retry=sc.nextInt();
			a=month;
			sc.nextLine();
			
		}while(retry==1);
		System.out.println("프로그램 종료");
			
	}

}
