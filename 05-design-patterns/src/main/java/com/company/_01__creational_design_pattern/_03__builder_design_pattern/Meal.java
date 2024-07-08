package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class Meal {

	private String curry;
	private String bread;
	private String rice;
	private String drink;
	private String snack;

	public String getCurry() {
		return curry;
	}

	public void setCurry(String curry) {
		this.curry = curry;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	@Override
	public String toString() {
		return "Meal -> [ curry=" + curry + ", bread=" + bread + ", rice=" + rice + ", drink=" + drink + ", snack=" + snack + " ]";
	}

}
