package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class Main {

	public static void main(String[] args) {

		Burger alooTikkiBurger = new Burger.BurgerBuilder().cheese(true).mayonese(true).onion(true).tomato(true).lettuce(true).alooTikki(true).build();
		System.out.println(alooTikkiBurger.toString());

		Burger paneerTikkiBurger = new Burger.BurgerBuilder().cheese(true).mayonese(true).onion(true).tomato(true).lettuce(true).paneerTikki(true).build();
		System.out.println(paneerTikkiBurger.toString());

		Meal vegMeal = new MealDirector(new VegMealBuilder()).getMeal();
		System.out.println(vegMeal.toString());

		Meal nonVegMeal = new MealDirector(new NonVegMealBuilder()).getMeal();
		System.out.println(nonVegMeal.toString());

	}

}
