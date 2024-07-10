package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes;

public class CheckboxWindows extends Checkbox {

	@Override
	public void createCheckbox() {
		System.out.println("windows - checkbox created");
	}

	@Override
	public void updateCheckbox() {
		System.out.println("windows - checkbox updated");
	}

	@Override
	public void displayCheckbox() {
		System.out.println("windows - checkbox displayed");
	}

	@Override
	public void deleteCheckbox() {
		System.out.println("windows - checkbox deleted");
	}

}