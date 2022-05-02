package student;

import java.util.*;

//5명 학생 두과목(수학,영어)을 입력받아서 과목별 평균,학생별 평균을 구하는 프로그램
public class student {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=5;
		int[][]subject =new int[number][2];
		int[] totalstudent = new int[number];
		int[] totalsubject = new int[2];
		System.out.printf("%d명 영어, 수학 점수 입력\n",number);
		
		for(int i=0;i<number; i++) {
			System.out.printf("%d번 영어 :",i+1);
			subject[i][0]=sc.nextInt();
			System.out.printf("     수학");
			subject[i][1]=sc.nextInt();
			System.out.println();
			
			totalstudent[i]=subject[i][0]+subject[i][1];
			totalsubject[0]+=subject[i][0]; //영어 합계
			totalsubject[1]+=subject[i][1]; //수학합계
		}
		System.out.println("no.   영어    수학     평균    ");
		for(int i=0; i<number; i++)
			System.out.printf("%2d %6d %6d %6.1f\n",i+1,subject[i][0],subject[i][1],(double)totalstudent[i]/2);
			
			System.out.printf("평균 %6.1f %6.1f \n",(double)totalsubject[0]/number,(double)totalsubject[1]/number);
		
	}

}
