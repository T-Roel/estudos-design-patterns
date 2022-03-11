package org.troel.abstractfactory.apple.factory;

import org.troel.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import org.troel.abstractfactory.apple.model.iphone.IPhone;
import org.troel.abstractfactory.apple.model.iphone.IPhoneX;
import org.troel.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	private static final String STANDARD = "standard";
	private static final String HIGH_END = "highEnd";
	
	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(STANDARD.equals(level)) {
			return new IPhoneX(rules);
		} else if(HIGH_END.equals(level)) {
			return new IPhoneXSMax(rules);
		} else return null;
	}
}
