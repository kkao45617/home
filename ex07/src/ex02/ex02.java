package ex02;
//set get을 이용하여 private 변수를 호출하여 사용하는 법
class tv{
	private boolean power;
	private int channel;
	
	public tv() {}
	public tv(int channel) {
		this.channel=channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	void power() {power=!power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}
}
class captiontv extends tv{
	boolean caption;
	public captiontv() {}
	public captiontv(int channel,boolean caption) {
		super(channel);
		this.caption=caption;
	}
	void displaycaption(String text) {
	if(caption) {
		System.out.println(text);
		}
	}
}

public class ex02 {

	public static void main(String[] args) {
		captiontv ctv=new captiontv(10,true);
	//	ctv.setChannel(10);
	//	ctv.channelup();
		System.out.println(ctv.getChannel());
		ctv.displaycaption("hello,world");
		ctv.setPower(true);
		ctv.displaycaption("un hello, world");
	}

}
