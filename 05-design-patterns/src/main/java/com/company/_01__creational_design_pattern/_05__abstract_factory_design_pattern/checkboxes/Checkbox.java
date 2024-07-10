package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes;

// note
// use abstract class when dealing with access modifiers for variables 
// use interface when there is no variable
public abstract class Checkbox {

	private String size;
	private String shape;
	private String color;

	public abstract void createCheckbox();

	public abstract void updateCheckbox();

	public abstract void displayCheckbox();

	public abstract void deleteCheckbox();

	public String getSize() {
		return size;
	}

	public String getShape() {
		return shape;
	}

	public String getColor() {
		return color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Checkbox -> [ shape=" + shape + " , size=" + size + " , color=" + color + " ]";
	}

}
