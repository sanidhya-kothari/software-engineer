package com.company._01__creational_design_pattern._02__prototype_design_pattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		VehicleRegistry registry = new VehicleRegistry();
		System.out.println(registry.getVehicle("two"));
		System.out.println(registry.getVehicle("four"));

	}

}
