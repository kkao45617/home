package ek01;
class data2{int x;}

public class ex01 {

	public static void main(String[] args) {
		data2 d = new data2();
		d.x=10;
		
		System.out.println("main :"+d.x);
		
		change(d);
		System.out.println("------");
		System.out.println("main before:"+d.x);

	}
	
	static void change(data2 a) {
		a.x=1000;
		System.out.println("change x:="+a.x);
	}

}
