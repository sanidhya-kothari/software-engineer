package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_1;

public class Application {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("a");
		careTaker.addSnapshot(originator.save());
		System.out.println(originator.getState());

		originator.setState("a b");
		careTaker.addSnapshot(originator.save());
		System.out.println(originator.getState());

		originator.setState("a b c");
		careTaker.addSnapshot(originator.save());
		System.out.println(originator.getState());

		originator.setState("a b c d");
		careTaker.addSnapshot(originator.save());
		System.out.println(originator.getState());
		originator.restore(careTaker.getSnapshot(2));
		System.out.println(originator.getState());

	}

}
