package Unit;
//다형성
public class Unit {

	public static void main(String[] args) {
		unit a= new marine();
		a.move(1, 3);
		marine b=(marine)a;
		b.stimpack();
		
	}

}
class unit{
	int x,y;
	void move(int x, int y) {
		System.out.println("좌표"+x+","+y+"유닛 움직임");
	}
	void stop() {
		System.out.println("유닛 멈춤");
	}
}

class marine extends unit{
	void stimpack() {
		System.out.println("마린이 스팀팩을 빤다");
	}
}
class tank extends unit{
	void changmode() {
		System.out.println("시즈모드 완료");
	}
}
class dropship extends unit{
	void load() {
		System.out.println("태운다");
	}
	void unload() {
		System.out.println("내린다.");
	}
}