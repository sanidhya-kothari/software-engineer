package com.company._01__creational_design_pattern._01__singleton_design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.company._01__creational_design_pattern._01__singleton_design_pattern._01__lazy_singleton.LazySingleton;
import com.company._01__creational_design_pattern._01__singleton_design_pattern._04__serializable_singleton.SerializableSingleton;
import com.company._01__creational_design_pattern._01__singleton_design_pattern._05__enum_singleton.EnumSingleton;

public class Main {

	public static void main(String[] args) throws Exception {
		breakingSingletonDesignPattern();
	}

	public static void breakingSingletonDesignPattern() throws Exception {

		// method-1: serialization & de-serialization
		LazySingleton instance1 = LazySingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.obj"));
		oos.writeObject(instance1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.obj"));
		LazySingleton instance2 = (LazySingleton) ois.readObject(); // de-serialized
		ois.close();
		System.out.println("object-1 : " + instance1.hashCode());
		System.out.println("object-2 : " + instance2.hashCode());

		// method-2: reflection
		Constructor<?>[] constructors = LazySingleton.class.getDeclaredConstructors();
		Constructor<?> constructor = constructors[0];
		constructor.setAccessible(true);
		LazySingleton instance3 = (LazySingleton) constructor.newInstance();
		System.out.println("object-1 : " + instance1.hashCode());
		System.out.println("object-3 : " + instance3.hashCode());

		// method-3: cloning

	}

	public static void solution() throws FileNotFoundException, IOException, ClassNotFoundException {

		// method-1
		SerializableSingleton instance1 = SerializableSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
		oos.writeObject(instance1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		SerializableSingleton instance2 = (SerializableSingleton) ois.readObject(); // de-serialized
		ois.close();
		System.out.println("object-1 : " + instance1.hashCode());
		System.out.println("object-2 : " + instance2.hashCode());

		// method-2
		EnumSingleton.INSTANCE.logic();

	}

}
