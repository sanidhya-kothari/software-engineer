package com.company._01__creational_design_pattern._01__singleton_design_pattern._04__serializable_singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SerializableSingleton instance = null;

	private SerializableSingleton() {

	}

	public static SerializableSingleton getInstance() {
		if (instance == null) {
			instance = new SerializableSingleton();
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}