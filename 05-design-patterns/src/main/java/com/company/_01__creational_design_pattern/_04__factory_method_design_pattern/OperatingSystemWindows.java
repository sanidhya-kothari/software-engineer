package com.company._01__creational_design_pattern._04__factory_method_design_pattern;

public class OperatingSystemWindows extends OperatingSystem {

	public OperatingSystemWindows(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void createDirectory(String directoryName) {
		System.out.println("mkdir " + directoryName);
	}

	@Override
	public void searchDirectory(String directoryName) {
		System.out.println("dir /s " + directoryName);
	}

	@Override
	public void changeDirectory(String directoryName) {
		System.out.println("cd " + directoryName);
	}

	@Override
	public void deleteDirectory(String directoryName) {
		System.out.println("rmdir /s /q " + directoryName);
	}

}