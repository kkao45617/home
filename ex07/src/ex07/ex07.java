package ex07;
//다형성
public class ex07 {

	public static void main(String[] args) {
		animal an = new animal();
		animal an2 = new mammal();
		animal an3 = new person();
		
		an.eat();
		an2.eat();
		an3.eat();
		
		Object obj= new person();

		mammal m1 = (mammal)an3;
		m1.eat();
		
	
		person p2= (person)obj;
		p2.eat();
	}

}
//동물
class animal{
	void eat() {
		System.out.println("동물이 먹는다");
	}
}
//포유류
class mammal extends animal{
	void eat() {
		System.out.println("포유류가 먹는다");
	}
}
//고래
class whale extends mammal{
	void eat() {
		System.out.println("고래가 먹는다");
	}
}
//사람
class person extends mammal{
	void eat() {
		System.out.println("사람이 먹는다");
	}
	void runt() {
		
	}
}
//조류
class birds extends animal{
	void eat() {
		System.out.println("조류가 먹는다");
	}
}
//펭귄
class penguin extends birds{
	void eat() {
		System.out.println("펭귄이 먹는다");
	}
}
//참새
class sparrow extends birds{
	void eat() {
		System.out.println("참새가 먹는다");
	}
}