package com.company.java_8._01__interface_updates._02__new_interface.default_method;

public class C implements A, B {

	@Override
	public void method1() {
		// we have to choose what we have to return from 3 different things
		// return "> Interface C: overrides default method of A and B";
		// return A.super.method1();
		// return B.super.method1();
		System.out.println("> Interface C: overrides default method of A and B");
	}

	@Override
	public void method2() {
		// business logic
	}

	public static void main(String[] args) {
		C c = new C();
		c.method1();
	}

}
