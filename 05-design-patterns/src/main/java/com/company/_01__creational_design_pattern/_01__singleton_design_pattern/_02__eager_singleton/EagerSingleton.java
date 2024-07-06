package com.company._01__creational_design_pattern._01__singleton_design_pattern._02__eager_singleton;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return instance;
	}

	// when the class is loaded in the JVM, at that time the object will be created automatically
	// so it solves the problem of lazy singleton where multiple threads try to access the same instance
	// drawback: if we are not using this object, the object will be created and stored in the memory so utilizes resources

}
