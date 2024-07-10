package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes;

public class CheckboxLinux extends Checkbox {

	@Override
	public void createCheckbox() {
		System.out.println("linux - checkbox created");
	}

	@Override
	public void updateCheckbox() {
		System.out.println("linux - checkbox updated");
	}

	@Override
	public void displayCheckbox() {
		System.out.println("linux - checkbox displayed");
	}

	@Override
	public void deleteCheckbox() {
		System.out.println("linux - checkbox deleted");
	}

}