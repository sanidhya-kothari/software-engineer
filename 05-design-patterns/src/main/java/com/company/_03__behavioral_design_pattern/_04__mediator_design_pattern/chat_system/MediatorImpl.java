package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.chat_system;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

	private List<ColleagueUser> users;

	public MediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addColleagueUser(ColleagueUser user) {
		this.users.add(user);
	}

	@Override
	public void sent(String message, ColleagueUser toUser) {
		toUser.receive(message);
	}

	@Override
	public void sentAll(String message, ColleagueUser fromUser) {
		for (ColleagueUser user : this.users) {
			if (user != fromUser) {
				user.receive(message);
			}
		}
	}

}