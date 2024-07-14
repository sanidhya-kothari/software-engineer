package com.company._02__structural_design_pattern._04__composite_design_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		Authorization student1 = new Student(UUID.randomUUID(), "student-1");
		Authorization student2 = new Student(UUID.randomUUID(), "student-2");
		Authorization student3 = new Student(UUID.randomUUID(), "student-3");
		Authorization student4 = new Student(UUID.randomUUID(), "student-4");

		Authorization associateProfessor1 = new ProfessorAssociate(UUID.randomUUID(), "associate-professor-1");
		Authorization associateProfessor2 = new ProfessorAssociate(UUID.randomUUID(), "associate-professor-2");

		List<Authorization> responsibilities = new ArrayList<>();
		responsibilities.add(associateProfessor1);
		responsibilities.add(associateProfessor2);
		responsibilities.add(student1);
		responsibilities.add(student2);
		responsibilities.add(student3);
		responsibilities.add(student4);

		Professor professor = new Professor(UUID.randomUUID(), "professor-1", responsibilities);
		professor.getResponsibilities();

	}

}
