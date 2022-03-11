package org.troel.factory.apple;

import org.troel.factory.apple.factory.IPhoneFactory;
import org.troel.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneFactory.orgerIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneFactory.orgerIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
