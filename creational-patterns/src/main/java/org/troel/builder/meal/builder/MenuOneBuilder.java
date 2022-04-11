package org.troel.builder.meal.builder;

public class MenuOneBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		meal.setDrink("Coke");
	}

	@Override
	public void buildMain() {
		meal.setMain("Cheeseburguer");
	}

	@Override
	public void buildSide() {
		meal.setSide("Onion Rings");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Apple Pie");
	}

	@Override
	public void buildGift() {
		meal.setToy("Avenger's Toy");
	}
}
