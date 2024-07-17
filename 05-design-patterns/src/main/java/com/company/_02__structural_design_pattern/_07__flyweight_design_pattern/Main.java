package com.company._02__structural_design_pattern._07__flyweight_design_pattern;

public class Main {

	// Cache Design Pattern
	public static void main(String[] args) {

		FlyweightFactory flyweightFactory = new FlyweightFactory();

		FlyweightIcon file1 = flyweightFactory.getIcon("file");
		FlyweightIcon file2 = flyweightFactory.getIcon("file");

		file1.draw(5, 5);
		file2.draw(10, 10);

		FlyweightIcon folder1 = flyweightFactory.getIcon("folder");
		FlyweightIcon folder2 = flyweightFactory.getIcon("folder");

		folder1.draw(5, 5);
		folder2.draw(10, 10);

	}

}
