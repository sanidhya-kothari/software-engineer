package com.company.java_8._01__interface_updates._02__new_interface.static_method;

public class B implements A {

	// here, method() of interface A is not overridden
	// static methods have no concept of overridden in the implementing classes
	private static void method() {
		System.out.println("> Interface B: static  method");
	}

	public static void main(String[] args) {
		// method - 1
		B b = new B();
		b.method();
		// method - 2
		B.method();
		// we can call the "static" method from interface A
		A.method();
	}

}
