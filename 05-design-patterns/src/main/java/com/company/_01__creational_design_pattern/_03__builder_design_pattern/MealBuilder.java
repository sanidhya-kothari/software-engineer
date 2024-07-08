package com.company._01__creational_design_pattern._03__builder_design_pattern;

public interface MealBuilder {

	public abstract void addCurry();

	public abstract void addBread();

	public abstract void addRice();

	public abstract void addDirnk();

	public abstract void addSnack();

	public abstract Meal build();

}
