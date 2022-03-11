package org.troel.abstractfactory.apple;

import org.troel.abstractfactory.apple.factory.IPhone11Factory;
import org.troel.abstractfactory.apple.factory.IPhoneFactory;
import org.troel.abstractfactory.apple.factory.IPhoneXFactory;
import org.troel.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import org.troel.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import org.troel.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brRules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(brRules);
		IPhoneFactory gen11Factory = new IPhone11Factory(brRules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
