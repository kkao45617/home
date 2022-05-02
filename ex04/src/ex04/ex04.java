//옮기기
package ex04;

public class ex04 {

	public static void main(String[] args) {
		int n1=0, n2=0;
		
		int[] kor = new int[5];
		
		n1=10;
		n2=20;
		
		System.out.println("��"+n1+","+n2);
		swap(n1,n2);
		System.out.println("��"+n1+","+n2);
		

	}
	public static void swap(int n1, int n2) {
		int x=0;
		x=n1;
		n1=n2;
		n2=x;
	}

}
