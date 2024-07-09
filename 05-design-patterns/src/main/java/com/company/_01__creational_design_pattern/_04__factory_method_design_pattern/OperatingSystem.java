package com.company._01__creational_design_pattern._04__factory_method_design_pattern;

public abstract class OperatingSystem {

	private String version;
	private String architecture;

	public OperatingSystem(String version, String architecture) {
		this.version = version;
		this.architecture = architecture;
	}

	public String getVersion() {
		return version;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public abstract void createDirectory(String directoryName);

	public abstract void searchDirectory(String directoryName);

	public abstract void changeDirectory(String directoryName);

	public abstract void deleteDirectory(String directoryName);

}
