package org.troel.builder.meal.builder;

public class MenuTwoBuilder extends FastFoodMealBuilder {
	
	@Override
	public void buildDrink() {
		meal.setDrink("Juice");
	}

	@Override
	public void buildMain() {
		meal.setMain("Veggie Burguer");
	}

	@Override
	public void buildSide() {
		meal.setSide("Salad");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Apple");
	}

	@Override
	public void buildGift() {
		meal.setToy("I'm Veggie's Stamp");
	}
}
