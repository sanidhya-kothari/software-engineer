package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories;

import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.Button;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.ButtonWindows;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.Checkbox;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.CheckboxWindows;

public class FactoryWindows implements AbstractFactory {

	@Override
	public Button getButton() {
		return new ButtonWindows();
	}

	@Override
	public Checkbox getCheckbox() {
		return new CheckboxWindows();
	}

}