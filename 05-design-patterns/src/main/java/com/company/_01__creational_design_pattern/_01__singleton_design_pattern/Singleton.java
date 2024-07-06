package com.company._01__creational_design_pattern._01__singleton_design_pattern;

import java.io.Serializable;
import java.util.Objects;

public class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private static volatile Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (Singleton.class) {
				if (Objects.isNull(instance)) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

	protected Object writeReplace() {
		return getInstance();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
