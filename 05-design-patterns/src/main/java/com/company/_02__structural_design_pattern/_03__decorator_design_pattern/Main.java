package com.company._02__structural_design_pattern._03__decorator_design_pattern;

public class Main {

	public static void main(String[] args) {

		Pizza dominosPizza = new DecoratorCheesy(new DecoratorTandoori(new PizzaDominos()));
		System.out.println(dominosPizza.bake());

		Pizza londonYardPpizza = new DecoratorTandoori(new DecoratorCheesy(new PizzaLondonYard()));
		System.out.println(londonYardPpizza.bake());

	}

}