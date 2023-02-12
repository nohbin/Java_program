package java_7day;

public class Tv {
	private int channel;
	private int volume;
	private int serialNumber = 0;
	public static int count = 0;
	
	
	public Tv() {
		count++;
		serialNumber = count;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getChannel() {
		return channel;
	}

	public Tv setChannel(int channel) {
		this.channel = channel;
		return this;
	}

	public int getVolume() {
		return volume;
	}

	public Tv setVolume(int volume) {
		this.volume = volume;
		return this;
	}

	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}
}
