package com.company.java_8._01__interface_updates._02__new_interface;

public interface NewInterface {

	// method - 1
	public abstract void method1();

	public default void method2() {
		// default business logic
	}

	public static void method3() {
		// static business logic
	}

	public static void main(String[] args) {
		// since java 8, static methods are allowed, so we can write a main method inside an interface and execute it as well
	}

	// method - 2
	void method4();

	default void method5() {
		// default business logic
	}

	static void method6() {
		// static business logic
	}

}
