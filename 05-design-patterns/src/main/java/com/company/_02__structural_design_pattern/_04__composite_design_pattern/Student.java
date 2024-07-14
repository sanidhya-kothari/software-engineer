package com.company._02__structural_design_pattern._04__composite_design_pattern;

import java.util.UUID;

public class Student implements Authorization {

	private UUID id;
	private String name;

	public Student(UUID id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void getIdentity() {
		System.out.println(getClass().getSimpleName() + " - " + id + ", " + name);
	}

}
