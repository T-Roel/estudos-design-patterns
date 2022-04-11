package org.troel.builder.meal.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		meal.setDrink("Milk Shake");
	}

	@Override
	public void buildMain() {
		meal.setMain("Triple Cheddar");
	}

	@Override
	public void buildSide() {
		meal.setSide("Onion Rings");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Large Ice Cream");
	}

	@Override
	public void buildGift() {
		meal.setToy("My Little Poney");
	}
}
