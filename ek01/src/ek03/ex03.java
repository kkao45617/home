package ek03;

class mytv2{
	boolean ispoweron;
	int channel;
	int volume;
	final int max_volume=100;
	final int min_volume=0;
	final int max_channel=100;
	final int min_channel=1;

	
	public void setchannel(int a) {
		channel=a;
	}
	public int getchannel() {
		return channel;
	}
	public void setvolume(int a) {
		volume=a;
	}
	public int getvolume() {
		return volume;
	}
	
}
public class ex03 {

	public static void main(String[] args) {
		mytv2 t = new mytv2();
		t.setchannel(10);
		System.out.println("ch:"+t.getchannel());
		t.setvolume(20);
		System.out.println("vol:"+t.getvolume());
		
	}

}
