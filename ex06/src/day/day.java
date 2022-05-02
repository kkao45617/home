package day;

import java.util.*;

public class day {

	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		String[] day= {"일","월","화","수","목","금","토"};
		String[] engday= {"sunday","monday","tuesday","wedensday","thursday","firday",
				"saturday"};
		int count=0;
		int uncount=0;
		System.out.println("해당 요일을 영어로 입력하세요");
		int retry=0;
		do
		{
			int month=(int)(Math.random()*7);
			
			while(true) {
				System.out.println(day[month]+"요일");
				
				String Dday=sc.nextLine();
				
				
				if(Dday.equals(engday[month]))break;
				System.out.println("오답입니다.");
				uncount++;
			}
			System.out.println("정답입니다 재도전(1) 그만(0)");
			retry=sc.nextInt();
			sc.nextLine();
			count++;
		}while(retry==1);
		System.out.println("프로그램 종료");
		System.out.println("성공횟수 :"+count);
		System.out.println("실패 횟수 :"+uncount);

	}

}
