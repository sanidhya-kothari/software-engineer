package com.company._03__behavioral_design_pattern._06__memento_design_pattern.method_2;

public class Application {

	public static void main(String[] args) {

		Originator originator = new Originator();

		originator.setState("a");
		originator.save();
		System.out.println(originator.getState());

		originator.setState("a b");
		originator.save();
		System.out.println(originator.getState());

		originator.setState("a b c");
		originator.save();
		System.out.println(originator.getState());

		originator.setState("a b c d");
		originator.save();
		System.out.println(originator.getState());
		originator.restore(1);
		System.out.println(originator.getState());

	}

}
