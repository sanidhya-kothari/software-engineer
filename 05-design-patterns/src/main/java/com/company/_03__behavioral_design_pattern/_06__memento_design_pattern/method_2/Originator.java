package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_2;

public class Originator {

	private String state;
	private CareTaker careTaker;

	public Originator() {
		careTaker = new CareTaker();
	}

	public Originator(String state) {
		careTaker = new CareTaker();
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void write(String state) {
		this.state += state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void save() {
		careTaker.addSnapshot(new Memento(this.state));
	}

	public void restore(int index) {
		this.state = careTaker.getSnapshot(index).getState();
	}

}
