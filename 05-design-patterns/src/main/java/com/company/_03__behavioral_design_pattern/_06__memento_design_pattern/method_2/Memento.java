package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_2;

public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
