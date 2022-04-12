package org.troel.decorator.coffeeShop;

import org.troel.decorator.coffeeShop.model.Drink;
import org.troel.decorator.coffeeShop.model.Expresso;
import org.troel.decorator.coffeeShop.model.Tea;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		
	}
}
