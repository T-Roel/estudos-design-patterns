package org.troel.observer.party.observers;

public class Friend implements Observer {
	
	public void sendGift() {
		System.out.println("Look, I bought your favourite beer!");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			sendGift();
		}else {
			System.out.println("Sleep...");
		}
	}
}
