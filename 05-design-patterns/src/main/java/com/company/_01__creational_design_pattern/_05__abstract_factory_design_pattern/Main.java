package com.company._01__creational_design_pattern._05__abstract_factory_design_pattern;

import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.client.ClientApplication;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories.FactoryLinux;
import com.company._01__creational_design_pattern._05__abstract_factory_design_pattern.factories.FactoryWindows;

public class Main {

	public static void main(String[] args) {

		ClientApplication app = applicationConfiguration("windows");
		app.getButton().setSize("5px");
		app.getButton().setShape("rectangle");
		app.getButton().setColor("red");
		app.getCheckbox().setSize("4px");
		app.getCheckbox().setShape("square");
		app.getCheckbox().setColor("red");
		app.getButton().createButton();
		app.getCheckbox().createCheckbox();
		app.getButton().displayButton();
		app.getCheckbox().displayCheckbox();
		app.paint();

	}

	public static ClientApplication applicationConfiguration(String os) {

		// String os = System.getProperty("os.name").toLowerCase();

		switch (os) {
			case "windows":
				return new ClientApplication(new FactoryWindows());
			case "linux":
				return new ClientApplication(new FactoryLinux());
			default:
				throw new RuntimeException("invalid operating system");
		}

	}

}