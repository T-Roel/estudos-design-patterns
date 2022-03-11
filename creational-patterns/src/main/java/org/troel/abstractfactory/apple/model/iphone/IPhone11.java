package org.troel.abstractfactory.apple.model.iphone;

import org.troel.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone {

	public IPhone11(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
