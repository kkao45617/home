package test;
//상속관계 extends와 super를 이용한 상관 관계
public class test {

	public static void main(String[] args) {
		abc a=new abc();
		a.setAbc(10,20);
		
		bcd b=new bcd(3,2,8);
		System.out.println(a.sum());
	}

}
class abc{
	
	private int a;
	private int b;
	
	public void setAbc(int a,int b) {
		this.a=a;
		this.b=b;
	}
	abc(){}
	abc(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public int getAbc() {
		return a;
	}


	public int sum() {
		return a+b;
	}
	
	

}
class bcd extends abc{
	int c;
	bcd(){}
	bcd(int a,int b,int c) {
	super(a,b);
	this.c=c;
	System.out.println(a+","+b+","+c);
	}
	
}
