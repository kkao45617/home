package lgsamsung;

public class samsungtv implements tv{

	@Override
	public void poweron1() {
		System.out.println("sam...on");
	}

	@Override
	public void powerdown1() {
		System.out.println("sam...down");
	}

	@Override
	public void volumup1() {
		System.out.println("vol....up");
	}

	@Override
	public void volumedown1() {
		System.out.println("vol....down");
	}
	
}
