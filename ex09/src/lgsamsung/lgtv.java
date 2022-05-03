package lgsamsung;

public class lgtv implements tv{

	@Override
	public void poweron1()  {
		System.out.println("lg...on");
	}

	@Override
	public void powerdown1() {
		System.out.println("lg...down");
	}

	@Override
	public void volumup1() {
		System.out.println("lg....up");
	}

	@Override
	public void volumedown1() {
		System.out.println("lg....down");
	}

}
