package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories;

import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.buttons.Button;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.checkboxes.Checkbox;

public interface AbstractFactory {

	public abstract Button getButton();

	public abstract Checkbox getCheckbox();

}