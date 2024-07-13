package com.company._02__structural_design_pattern._03__decorator_design_pattern;

public class DecoratorTandoori extends Decorator {

	public DecoratorTandoori(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String bake() {
		return super.bake() + tandoori();
	}

	public String tandoori() {
		return "tandoori";
	}

}
