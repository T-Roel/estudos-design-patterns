package org.troel.observer.party.subject;

import java.util.ArrayList;
import java.util.List;

import org.troel.observer.party.observers.Observer;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer observer : observers) {
			observer.update(status);
		}
	}
}
