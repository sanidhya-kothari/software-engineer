package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class MealDirector {

	private MealBuilder mealBuilder;

	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	public Meal getMeal() {
		mealBuilder.addCurry();
		mealBuilder.addBread();
		mealBuilder.addRice();
		mealBuilder.addDirnk();
		mealBuilder.addSnack();
		return mealBuilder.build();
	}

}
