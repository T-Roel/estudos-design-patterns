package org.troel.builder.meal;

import org.troel.builder.meal.builder.FastFoodMealBuilder;
import org.troel.builder.meal.builder.FatMealBuilder;
import org.troel.builder.meal.builder.JustFriesBuilder;
import org.troel.builder.meal.builder.MenuOneBuilder;
import org.troel.builder.meal.builder.MenuTwoBuilder;
import org.troel.builder.meal.director.MealDirector;

public class Client {
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		order("Burger", new MenuOneBuilder());
		order("Veggie Burger", new MenuTwoBuilder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}