package ez02;

import java.util.Scanner;

public class ez02 {

	public static void main(String[] args) {
		int bingo[][] = new int [10][10];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo.length;j++) {
				bingo[i][j]=(int)((Math.random()*10)+1);
			}
		}
		
		
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo.length; j++) {
				System.out.printf(" "+bingo[i][j]+" ");
			}
			System.out.println();
		}


	}

}
