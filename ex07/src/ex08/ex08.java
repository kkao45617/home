package ex08;
//instanceof 활용문

public class ex08 {

	static void action(robot a){
		if(a instanceof Dancerobot) {
			Dancerobot action= (Dancerobot)a;
			action.dance();
		}
		else if(a instanceof Singrobot) {
			Singrobot action=(Singrobot)a;
			action.sing();
		}
		else if(a instanceof Drawrobot) {
			Drawrobot action = (Drawrobot)a;
			action.draw();
		}
	}
	
	
	public static void main(String[] args) {

		robot[] arr = {new Dancerobot(), new Singrobot(),new Drawrobot()};
		
		for(int i=0; i<arr.length;i++) {
			action(arr[i]);
		}
		
	}

	
	class robot{}
	
	class Dancerobot extends robot{
		void dance() {
			System.out.println("춤을 춥니다");
		}
	}
	class Singrobot extends robot{
		void sing() {
			System.out.println("노래를 합니다.");
		}
	}
	class Drawrobot extends robot{
		void draw() {
			System.out.println("그림을 그립니다.");
		}
	}

}
