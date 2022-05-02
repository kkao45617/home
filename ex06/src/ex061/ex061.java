package ex061;
//파일 입출력 관련 수업
import java.io.*;
import java.util.*;

public class ex061 {

	public static void main(String[] args) throws IOException {
		int count=0;
		{
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			
			while(sc.hasNextLine()) {//읽어올 데이터 있는지 확인
				sc.nextLine();
				count++;
				
			}
			count--;
			System.out.println(count);
			sc.close();
			infile.close();
			
		}
		  String[] region = new String[count];
	      String[] city = new String[count];
	      String[] district = new String[count];
	      String[] dong = new String[count];
	      int[] variety = new int[count];
	      int[] howmany = new int[count];
	      String[] owner = new String[count];
	      String[] office = new String[count];
	      String[] callnum = new String[count];
	      String[] data = new String[count];
	      {
	    	  File file = new File("data/suwon.txt");
				FileInputStream infile = new FileInputStream(file);
				Scanner sc = new Scanner(infile);
				int total=0;
				
				sc.nextLine(); 	//첫번째 줄 버린다.
				for(int i=0; i<count; i++) {
					String line=sc.nextLine();
					
					String[] tokens = line.split(",");
					region[i]=tokens[0];
					city[i]=tokens[1];
					district[i]=tokens[2];
					dong[i]=tokens[3];
					variety[i]= Integer.parseInt(tokens[4]);
					howmany[i]=Integer.parseInt(tokens[5]);
					total += variety[i];
					
				}
				
				for(int i=0; i<count; i++)
					System.out.printf("%s %s %s %s %d %d \n",region[i],city[i],district[i],dong[i],variety[i],howmany[i]);
				System.out.println("총합"+total);
	      }
	      
		

	}

}
