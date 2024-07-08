package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class NonVegMealBuilder implements MealBuilder {

	private Meal meal;

	public NonVegMealBuilder() {
		this.meal = new Meal();
	}

	@Override
	public void addCurry() {
		this.meal.setCurry("butter chicken");
	}

	@Override
	public void addBread() {
		this.meal.setBread("garlic naan");
	}

	@Override
	public void addRice() {
		this.meal.setRice("biryani");
	}

	@Override
	public void addDirnk() {
		this.meal.setDrink("cola");
	}

	@Override
	public void addSnack() {
		this.meal.setSnack("chicken tikka");
	}

	@Override
	public Meal build() {
		return meal;
	}

}