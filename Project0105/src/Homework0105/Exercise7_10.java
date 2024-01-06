package Homework0105;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevCh;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setPowerOn(boolean isPowerOn){
		this.isPowerOn = isPowerOn;
	}
	public void setChannel(int channel) {
		if(channel<MIN_CHANNEL||channel>MAX_CHANNEL)return;
		prevCh = this.channel;
		this.channel = channel;
	}
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME||volume>MAX_VOLUME) return;
		this.volume = volume;
	}
	public void gotoPrevChannel() {
		setChannel(prevCh);
	}
}

public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOLUME : " + t.getVolume());
	}
}
