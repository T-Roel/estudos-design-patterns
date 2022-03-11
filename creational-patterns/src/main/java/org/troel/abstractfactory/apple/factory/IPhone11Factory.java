package org.troel.abstractfactory.apple.factory;

import org.troel.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import org.troel.abstractfactory.apple.model.iphone.IPhone;
import org.troel.abstractfactory.apple.model.iphone.IPhone11;
import org.troel.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
	
	private static final String STANDARD = "standard";
	private static final String HIGH_END = "highEnd";

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(STANDARD.equals(level)) {
			return new IPhone11(rules);
		} else if(HIGH_END.equals(level)) {
			return new IPhone11Pro(rules);
		} else return null;
	}
}
