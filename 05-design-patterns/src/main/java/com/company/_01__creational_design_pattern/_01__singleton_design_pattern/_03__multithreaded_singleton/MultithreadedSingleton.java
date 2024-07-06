package com.company._01__creational_design_pattern._01__singleton_design_pattern._03__multithreaded_singleton;

public class MultithreadedSingleton {

	private static MultithreadedSingleton instance = null;

	private MultithreadedSingleton() {

	}

	public static MultithreadedSingleton getInstance() {
		if (instance == null) {
			// our method is static, so we have class level locking
			synchronized (MultithreadedSingleton.class) {
				// reason for second null check
				// lets say two threads came inside first null check at the same time
				// one call has taken lock and proceeds for creating object for the first time
				// now once lock is released for t1, t2 should not create object because its already created
				if (instance == null) {
					instance = new MultithreadedSingleton();
				}
			}
		}
		return instance;
	}

}
