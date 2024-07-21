package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.chat_system;

public interface Mediator {

	public abstract void sent(String message, ColleagueUser toUser);

	public abstract void sentAll(String message, ColleagueUser fromUser);

	public abstract void addColleagueUser(ColleagueUser user);

}
