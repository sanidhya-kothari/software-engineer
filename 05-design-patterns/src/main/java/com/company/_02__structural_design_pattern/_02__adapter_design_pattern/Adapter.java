package com.company._02__structural_design_pattern._02__adapter_design_pattern;

public class Adapter implements FoodItem {

	private GroceryItem item;

	public Adapter(GroceryItem item) {
		this.item = item;
	}

	@Override
	public String getItem() {
		return item.getItem();
	}

	@Override
	public String getPrice() {
		return item.getPrice();
	}

	@Override
	public String getRestaurant() {
		return item.getStore();
	}

	@Override
	public String getLocation() {
		return item.getLocation();
	}

}
