package com.company._01__creational_design_pattern._04__factory_method_design_pattern;

public class Main {

	public static void main(String[] args) {

		OperatingSystem os1 = OperatingSystemFactory.getInstance("windows", "11", "x64");
		os1.createDirectory("tests");
		os1.searchDirectory("test");
		os1.changeDirectory("test");
		os1.deleteDirectory("test");

		OperatingSystem os2 = OperatingSystemFactory.getInstance("linux", "22.04", "x86_64");
		os2.createDirectory("tests");
		os2.searchDirectory("test");
		os2.changeDirectory("test");
		os2.deleteDirectory("test");

	}

}
