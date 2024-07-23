package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_2;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> snapshot;

	public CareTaker() {
		snapshot = new ArrayList<>();
	}

	public void addSnapshot(Memento memento) {
		snapshot.add(memento);
	}

	public void removeSnapshot(Memento memento) {
		snapshot.remove(memento);
	}

	public Memento getSnapshot(int index) {
		return snapshot.get(index);
	}

}
