package org.troel.decorator.coffeeShop.model.decorators;

import org.troel.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("- Adding 30ml of milk");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5;
	}
}
