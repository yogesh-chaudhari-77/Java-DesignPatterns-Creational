package Builder;

import PhoneComponents.Cellular;
import PhoneComponents.Gps;
import PhoneComponents.Gpu;
import PhoneComponents.Nfc;
import PhoneComponents.Processor;
import PhoneComponents.Wifi;

public class Director {

	public void buildBudgetPhone(PhoneBuilder phoneBuilder) {
		phoneBuilder.setCellular(new Cellular());
		phoneBuilder.setProcessor(new Processor());
		phoneBuilder.setWifi(new Wifi());
	}
	
	public void buildFlagShip(PhoneBuilder phoneBuilder) {
		
		phoneBuilder.setCellular(new Cellular());
		phoneBuilder.setProcessor(new Processor());
		phoneBuilder.setWifi(new Wifi());
		phoneBuilder.setGPS(new Gps());
		phoneBuilder.setGPU(new Gpu());
		phoneBuilder.setNFC(new Nfc());
		
	}
}
