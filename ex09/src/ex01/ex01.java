package ex01;



public class ex01 {

	public static void main(String[] args) {
		
		fighter f= new fighter();
		
		if(f instanceof unit) {
			System.out.println("f는 unit클래스의 자손입니다");
		}
		if(f instanceof fightable) {
			System.out.println("f는 fighttable 인터페이스를 구현했습니다");
		}
		if(f instanceof movable) {
			System.out.println("f는 movable인터페이스를 구현했습니다");
		}
		if(f instanceof attackable) {
			System.out.println("f는 attackable인터페이스를 구현했습니다");
		}
		if(f instanceof Object) {
			System.out.println("f는 object클래스의 자손입니다.");
		}
	}

}

class fighter extends unit implements fightable{
	public void move(int x, int y) {
		
	}
	public void attack(unit u) {
		
	}
}
class unit {
	int currenthp;
	int x;
	int y;
}

interface fightable extends movable, attackable{
	
}
interface movable{
	void move(int x, int y);
}
interface attackable {
	void attack(unit u);
}