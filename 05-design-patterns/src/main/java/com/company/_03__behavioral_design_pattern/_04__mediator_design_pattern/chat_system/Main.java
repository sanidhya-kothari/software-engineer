package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.chat_system;

public class Main {

	public static void main(String[] args) {

		Mediator mediator = new MediatorImpl();
		ColleagueUser user1 = new ColleagueUserImpl(mediator, "user-1");
		ColleagueUser user2 = new ColleagueUserImpl(mediator, "user-2");
		ColleagueUser user3 = new ColleagueUserImpl(mediator, "user-3");
		ColleagueUser user4 = new ColleagueUserImpl(mediator, "user-4");

		mediator.addColleagueUser(user1);
		mediator.addColleagueUser(user2);
		mediator.addColleagueUser(user3);
		mediator.addColleagueUser(user4);

		System.out.println("one-to-one");
		user1.send("let's go on a date", user2);

		System.out.println("one-to-many");
		user1.sendAll("i am busy tonight");

	}

}
