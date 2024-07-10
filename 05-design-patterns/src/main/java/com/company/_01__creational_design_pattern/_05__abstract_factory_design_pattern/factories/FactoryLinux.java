package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories;

import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.Button;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.ButtonLinux;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.Checkbox;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.CheckboxLinux;

public class FactoryLinux implements AbstractFactory {

	@Override
	public Button getButton() {
		return new ButtonLinux();
	}

	@Override
	public Checkbox getCheckbox() {
		return new CheckboxLinux();
	}

}