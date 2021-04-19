package Builder;

import PhoneComponents.Cellular;
import PhoneComponents.Gps;
import PhoneComponents.Gpu;
import PhoneComponents.Nfc;
import PhoneComponents.Processor;
import PhoneComponents.Screen;
import PhoneComponents.Wifi;

public class PhoneBuilder implements IBuilder {

	private String phoneCategory = null;
	private Processor processor = null;
	private Screen screen = null;
	private Gpu gpu = null;
	private Gps gps = null;
	private Nfc nfc = null;
	private Wifi wifi = null;
	private Cellular cellular = null;
	
	public PhoneBuilder(String phoneCategory) {
		this.phoneCategory = phoneCategory;
	}

	@Override
	public void setGPU(Gpu gpu) {

		this.gpu = gpu;
		
	}

	@Override
	public void setGPS(Gps gps) {
		this.gps = gps;
	}

	@Override
	public void setNFC(Nfc nfc) {
		this.nfc = nfc;
	}

	@Override
	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	@Override
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	@Override
	public void setCellular(Cellular cellular) {
		this.cellular = cellular;
	}

	public Phone getResult() {
		
		return new Phone(this.phoneCategory, this.processor, this.screen, this.gpu, this.gps, this.nfc, this.wifi, this.cellular);
		
	}


}
