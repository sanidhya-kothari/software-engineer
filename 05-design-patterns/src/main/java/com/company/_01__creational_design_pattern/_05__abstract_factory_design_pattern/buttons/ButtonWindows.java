package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons;

public class ButtonWindows extends Button {

	@Override
	public void createButton() {
		System.out.println("windows - button created");
	}

	@Override
	public void updateButton() {
		System.out.println("windows - button updated");
	}

	@Override
	public void displayButton() {
		System.out.println("windows - button displayed");
	}

	@Override
	public void deleteButton() {
		System.out.println("windows - button deleted");
	}

}