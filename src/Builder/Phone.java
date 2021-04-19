package Builder;

import PhoneComponents.Cellular;
import PhoneComponents.Gps;
import PhoneComponents.Gpu;
import PhoneComponents.Nfc;
import PhoneComponents.Processor;
import PhoneComponents.Screen;
import PhoneComponents.Wifi;

public class Phone {
	
	private String phoneCategory = null;
	private Processor processor = null;
	private Screen screen = null;
	private Gpu gpu = null;
	private Gps gps = null;
	private Nfc nfc = null;
	private Wifi wifi = null;
	private Cellular cellular = null;
	
	public Phone(String phoneCategory, Processor processor, Screen screen, Gpu gpu, Gps gps, Nfc nfc, Wifi wifi, Cellular cellular) {
		
		this.phoneCategory = phoneCategory;
		this.processor = processor;
		this.screen = screen;
		this.gpu = gpu;
		this.gps = gps;
		this.nfc = nfc;
		this.wifi = wifi;
		this.cellular = cellular;
	}

	public String getPhoneCategory() {
		return phoneCategory;
	}

	public void setPhoneCategory(String phoneCategory) {
		this.phoneCategory = phoneCategory;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Gpu getGpu() {
		return gpu;
	}

	public void setGpu(Gpu gpu) {
		this.gpu = gpu;
	}

	public Gps getGps() {
		return gps;
	}

	public void setGps(Gps gps) {
		this.gps = gps;
	}

	public Nfc getNfc() {
		return nfc;
	}

	public void setNfc(Nfc nfc) {
		this.nfc = nfc;
	}

	public Wifi getWifi() {
		return wifi;
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	public Cellular getCellular() {
		return cellular;
	}

	public void setCellular(Cellular cellular) {
		this.cellular = cellular;
	}

	@Override
	public String toString() {
		return "Phone [phoneCategory=" + phoneCategory + ", processor=" + processor + ", screen=" + screen + ", gpu="
				+ gpu + ", gps=" + gps + ", nfc=" + nfc + ", wifi=" + wifi + ", cellular=" + cellular + "]";
	}
	
	
}
