package com.company._02__structural_design_pattern._04__composite_design_pattern;

import java.util.List;
import java.util.UUID;

public class Professor implements Authorization {

	private UUID id;
	private String name;
	private List<Authorization> responsibilities;

	public Professor(UUID id, String name, List<Authorization> responsibilities) {
		this.id = id;
		this.name = name;
		this.responsibilities = responsibilities;
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void addResponsibility(Authorization responsibility) {
		responsibilities.add(responsibility);
	}

	public void removeResponsibility(Authorization responsibility) {
		responsibilities.remove(responsibility);
	}

	public void getResponsibilities() {
		responsibilities.forEach(Authorization::getIdentity);
	}

	@Override
	public void getIdentity() {
		System.out.println(getClass().getSimpleName() + " - " + id + ", " + name);
	}

}