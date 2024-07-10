package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons;

// note
// use abstract class when dealing with access modifiers for variables 
// use interface when there is no variable 
public abstract class Button {

	private String size;
	private String shape;
	private String color;

	public abstract void createButton();

	public abstract void updateButton();

	public abstract void displayButton();

	public abstract void deleteButton();

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
		return "Button -> [ shape=" + shape + " , size=" + size + " , color=" + color + " ]";
	}

}
