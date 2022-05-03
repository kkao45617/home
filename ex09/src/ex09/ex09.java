package ex09;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class a{
	int a;
	void test() {
		System.out.println("class a!!!!!");
	}
}

class b extends a{
	int b;
	void test() {
		System.out.println("class b");
	}
}
class c extends b{
	int c;
	void test() {
		System.out.println("class c!!!!!");
	}
}