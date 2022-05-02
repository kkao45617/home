//파일 보기 and 파일 출력하기
package ex06;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class ex06 {

	public static void main(String[] args) throws IOException, InterruptedException {
		int cn=0;
		int abc=0;
		{
		File file = new File("data/data1.txt");
		FileInputStream src= new FileInputStream(file);
		Scanner sc=new Scanner(src);
		
		while(sc.hasNext()) {
			String tmp = sc.next();
			System.out.printf("%s ", tmp);
			cn++;
			
		}
		sc.close();
		src.close();
		}
		
		System.out.println("sl "+ cn);
		int[] nums =new int[cn];
		
		
		{//배열에 있는 값들
			File file = new File("data/data1.txt");
			FileInputStream src= new FileInputStream(file);
			Scanner sc=new Scanner(src);
			
			for(int i=0; i<cn; i++) {
				String tmp=sc.next();
				nums[i]=Integer.parseInt(tmp);
			}
			System.out.println("num : "+Arrays.toString(nums));
		}
		
		{//특정 숫자가 잇는 방 
			File file = new File("data/data1.txt");
			FileInputStream src= new FileInputStream(file);
			Scanner sc=new Scanner(src);
			
			for(int i=0; i<cn; i++) {
				if(nums[i]==88) 
					System.out.println("88 방 :"+(i+1));
			}
			
		}
		
		{//순서 바꾸기
				int a;
				a=nums[0];
				nums[0]=nums[5];
				nums[5]=a;
				System.out.println("순서 바꾸기:"+Arrays.toString(nums));
			
		}
		
		{//배열 마지막으로 보내기

			for(int i=0; i<cn-1;i++)
			{
				int a;
				a=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=a;
				
				
				Thread.sleep(1000);
				
				for(int j=0; j<50;j++)
					System.out.println();
				
				for(int j=0;j<cn; j++) {
	
					
					if(j==i+1 || j==i+0)
						System.out.printf("[%d] ",nums[j]);
					else
						System.out.printf("%d ",nums[j]);
				}
			}
		}
	
		

		
		
		
	}

}
