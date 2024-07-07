package com.company._01__creational_design_pattern._02__prototype_design_pattern;

public class VehicleWheelerFour extends Vehicle {

	private boolean autopilot;
	private boolean manual;
	private boolean automatic;
	private boolean electric;
	private boolean petrol;
	private boolean diesel;

	public VehicleWheelerFour(String company, String model, String price, boolean autopilot, boolean manual, boolean automatic, boolean electric, boolean petrol, boolean diesel) {
		super(company, model, price);
		this.autopilot = autopilot;
		this.manual = manual;
		this.automatic = automatic;
		this.electric = electric;
		this.petrol = petrol;
		this.diesel = diesel;
	}

	@Override
	protected VehicleWheelerFour clone() throws CloneNotSupportedException {
		return (VehicleWheelerFour) super.clone();
	}

	public boolean isAutopilot() {
		return autopilot;
	}

	public void setAutopilot(boolean autopilot) {
		this.autopilot = autopilot;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
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

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

}
