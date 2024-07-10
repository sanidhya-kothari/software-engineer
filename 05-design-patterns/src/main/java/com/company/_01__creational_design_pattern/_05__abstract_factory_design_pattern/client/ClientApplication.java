package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.client;

import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.Button;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.Checkbox;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories.AbstractFactory;

public class ClientApplication {

	private Button button;
	private Checkbox checkbox;

	public ClientApplication(AbstractFactory factory) {
		this.button = factory.getButton();
		this.checkbox = factory.getCheckbox();
	}

	public void paint() {
		System.out.println(button.toString());
		System.out.println(checkbox.toString());
	}

	public Button getButton() {
		return button;
	}

	public Checkbox getCheckbox() {
		return checkbox;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void setCheckbox(Checkbox checkbox) {
		this.checkbox = checkbox;
	}

}
