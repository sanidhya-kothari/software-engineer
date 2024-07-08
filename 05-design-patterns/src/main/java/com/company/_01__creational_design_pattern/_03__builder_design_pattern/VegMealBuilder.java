package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class VegMealBuilder implements MealBuilder {

	private Meal meal;

	public VegMealBuilder() {
		this.meal = new Meal();
	}

	@Override
	public void addCurry() {
		this.meal.setCurry("paneer butter masala");
	}

	@Override
	public void addBread() {
		this.meal.setBread("butter roti");
	}

	@Override
	public void addRice() {
		this.meal.setRice("pulav");
	}

	@Override
	public void addDirnk() {
		this.meal.setDrink("butter milk");
	}

	@Override
	public void addSnack() {
		this.meal.setSnack("paneer tikka");
	}

	@Override
	public Meal build() {
		return meal;
	}

}