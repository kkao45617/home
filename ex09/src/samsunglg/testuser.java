package samsunglg;

public class testuser {

	public static void main(String[] args) {
		samsunglg tv = new samsunglg();
		tv.poweron();
		tv.poweroff();
		tv.volumeup();
		tv.volumedown();
		
		lgtv lgtv = new lgtv();
		
		lgtv.turnon();
		lgtv.turnoff();
		lgtv.soundup();
		lgtv.sounddown();
	}

}
