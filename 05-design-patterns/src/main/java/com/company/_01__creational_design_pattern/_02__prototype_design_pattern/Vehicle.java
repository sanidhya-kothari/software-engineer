package com.company._01__creational_design_pattern._02__prototype_design_pattern;

public abstract class Vehicle implements Cloneable {

	private String company;
	private String model;
	private String price;

	public Vehicle(String company, String model, String price) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
	}

	@Override
	protected Vehicle clone() throws CloneNotSupportedException {
		return (Vehicle) super.clone();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
