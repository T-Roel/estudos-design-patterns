package org.troel.observer.party;

import org.troel.observer.party.observers.Friend;
import org.troel.observer.party.observers.Wife;
import org.troel.observer.party.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman reception = new Doorman();
		reception.add(new Wife());
		reception.add(new Friend());
		
		System.out.println("Husband is comming!");
		reception.setStatus(true);
	}
}
