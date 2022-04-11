package org.troel.builder.meal.director;

import org.troel.builder.meal.builder.FastFoodMealBuilder;
import org.troel.builder.meal.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;
	
	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
