package com.company._01__creational_design_pattern._01__singleton_design_pattern._01__lazy_singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	// in a single threaded application, this code will work fine
	// drawback: in a multi-threaded application, this code will break/fail at line 14
	// as for the first time when multiple threads try to access the instance, multiple objects will be created
	// because no instance will be present at that time

}
