package com.company._02__structural_design_pattern._02__adapter_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class ClientApplication {

	private List<FoodItem> items = new ArrayList<>();

	public ClientApplication() {

	}

	public List<FoodItem> getItems() {
		return items;
	}

	public void setItems(List<FoodItem> items) {
		this.items = items;
	}

	public void addItem(FoodItem item) {
		items.add(item);
	}

}
