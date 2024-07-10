package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons;

public class ButtonLinux extends Button {

	@Override
	public void createButton() {
		System.out.println("linux - button created");
	}

	@Override
	public void updateButton() {
		System.out.println("linux - button updated");
	}

	@Override
	public void displayButton() {
		System.out.println("linux - button displayed");
	}

	@Override
	public void deleteButton() {
		System.out.println("linux - button deleted");
	}

}