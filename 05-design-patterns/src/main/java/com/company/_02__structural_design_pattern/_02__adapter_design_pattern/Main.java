package com.company._02__structural_design_pattern._02__adapter_design_pattern;

public class Main {

	public static void main(String[] args) {

		ClientApplication app = new ClientApplication();
		app.addItem(new FoodProduct());
		app.addItem(new Adapter(new GroceryProduct()));
		app.addItem(new FoodProduct());
		app.getItems().forEach(System.out::println);

	}

}
