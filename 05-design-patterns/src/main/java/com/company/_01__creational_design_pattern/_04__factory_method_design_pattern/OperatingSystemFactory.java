package com.company._01__creational_design_pattern._04__factory_method_design_pattern;

public class OperatingSystemFactory {

	// note: we do not want the object of factory
	// so we have used a private constructor and a static method to return the instance of required class
	private OperatingSystemFactory() {

	}

	public static OperatingSystem getInstance(String type, String version, String architecture) {
		switch (type) {
			case "windows":
				return new OperatingSystemWindows(version, architecture);
			case "linux":
				return new OperatingSystemLinux(version, architecture);
			default:
				throw new IllegalArgumentException("os not supported");
		}
	}

}
