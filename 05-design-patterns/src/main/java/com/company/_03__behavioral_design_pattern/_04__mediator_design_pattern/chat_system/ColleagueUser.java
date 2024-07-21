package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.chat_system;

public interface ColleagueUser {

	public abstract void send(String message, ColleagueUser toUser);

	public abstract void sendAll(String message);

	public abstract void receive(String message);

}