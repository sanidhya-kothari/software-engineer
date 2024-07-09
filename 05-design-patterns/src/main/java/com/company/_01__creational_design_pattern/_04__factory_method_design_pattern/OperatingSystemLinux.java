package com.company._01__creational_design_pattern._04__factory_method_design_pattern;

public class OperatingSystemLinux extends OperatingSystem {

	public OperatingSystemLinux(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void createDirectory(String directoryName) {
		System.out.println("mkdir " + directoryName);
	}

	@Override
	public void searchDirectory(String directoryName) {
		System.out.println("find . -name " + directoryName);
	}

	@Override
	public void changeDirectory(String directoryName) {
		System.out.println("cd " + directoryName);
	}

	@Override
	public void deleteDirectory(String directoryName) {
		System.out.println("rm -r " + directoryName);
	}

}