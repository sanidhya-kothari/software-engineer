package com.company.java_8._01__interface_updates._02__new_interface.default_method;

public interface A {

	public default void method1() {
		System.out.println("> Interface A: default method");
	}

	public abstract void method2();

}
