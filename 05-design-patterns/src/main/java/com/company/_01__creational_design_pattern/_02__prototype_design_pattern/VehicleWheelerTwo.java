package com.company._01__creational_design_pattern._02__prototype_design_pattern;

public class VehicleWheelerTwo extends Vehicle {

	private boolean manual;
	private boolean electric;
	private boolean petrol;

	public VehicleWheelerTwo(String company, String model, String price, boolean manual, boolean electric, boolean petrol) {
		super(company, model, price);
		this.manual = manual;
		this.electric = electric;
		this.petrol = petrol;
	}

	@Override
	protected VehicleWheelerTwo clone() throws CloneNotSupportedException {
		return (VehicleWheelerTwo) super.clone();
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public boolean isPetrol() {
		return petrol;
	}

	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}

}
