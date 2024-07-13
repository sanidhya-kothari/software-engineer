package com.company._02__structural_design_pattern._03__decorator_design_pattern;

public abstract class Decorator implements Pizza {

	private Pizza pizza;

	public Decorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String bake() {
		return pizza.bake();
	}

}
