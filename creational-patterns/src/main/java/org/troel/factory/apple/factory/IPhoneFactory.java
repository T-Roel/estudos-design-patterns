package org.troel.factory.apple.factory;

import org.troel.factory.apple.model.IPhone;
import org.troel.factory.apple.model.IPhone11;
import org.troel.factory.apple.model.IPhone11Pro;
import org.troel.factory.apple.model.IPhoneX;
import org.troel.factory.apple.model.IPhoneXSMax;

public class IPhoneFactory {
	
	private static final String STANDARD = "standard";
	private static final String HIGH_END = "highEnd";
	private static final String X_GEN = "X";
	private static final String GEN_11 = "11";
	
	public static IPhone orgerIPhone(String generation, String level) {
		IPhone device = null;
		
		if(X_GEN.equals(generation)) {
			if(STANDARD.equals(level)) {
				device = new IPhoneX();
			}else if(HIGH_END.equals(level)) {
				device = new IPhoneXSMax();
			}
		} else if(GEN_11.equals(generation)) {
			if(STANDARD.equals(level)) {
				device = new IPhone11();
			}else if(HIGH_END.equals(level)) {
				device = new IPhone11Pro();
			}
		}
		
		if(device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}
		
		return device;
	}
}
