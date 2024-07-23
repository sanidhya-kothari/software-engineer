package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_1;

public class Originator {

	private String state;

	public Originator() {

	}

	public void setState(String state) {
		this.state = state;
	}

	public Originator(String state) {
		this.state = state;
	}

	public void write(String state) {
		this.state += state;
	}

	public String getState() {
		return this.state;
	}

	public Memento save() {
		return new Memento(this.state);
	}

	public void restore(Memento memento) {
		this.state = memento.getState();
	}

}
