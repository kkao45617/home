package dice;

public class dice {

	public static void main(String[] args) throws InterruptedException {
		
		while(true) {
		int num1=(int)((Math.random()*6)+1);
		int num2=(int)((Math.random()*6)+1);
		System.out.println("<"+num1+","+num2+">");
		if((num1+num2)==5) {
			System.out.println("값이 나왔습니다");
			break;
		}
		Thread.sleep(1000);
		}

		
	}

}
