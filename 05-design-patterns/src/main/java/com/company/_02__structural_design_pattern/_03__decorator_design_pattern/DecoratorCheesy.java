package com.company._02__structural_design_pattern._03__decorator_design_pattern;

public class DecoratorCheesy extends Decorator {

	public DecoratorCheesy(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String bake() {
		return super.bake() + cheesy();
	}

	public String cheesy() {
		return "cheesy";
	}

}
