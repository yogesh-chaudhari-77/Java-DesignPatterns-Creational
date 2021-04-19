package Builder;

import PhoneComponents.Cellular;
import PhoneComponents.Gps;
import PhoneComponents.Gpu;
import PhoneComponents.Nfc;
import PhoneComponents.Processor;
import PhoneComponents.Wifi;

public interface IBuilder {

	public void setGPU(Gpu gps);
	public void setGPS(Gps gps);
	public void setNFC(Nfc nfc);
	public void setWifi(Wifi wifi);
	void setProcessor(Processor processor);
	void setCellular(Cellular cellular);
}
