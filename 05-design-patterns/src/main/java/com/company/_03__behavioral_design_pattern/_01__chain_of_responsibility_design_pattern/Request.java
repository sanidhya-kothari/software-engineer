package com.company._03__behavioral_design_pattern._01__chain_of_responsibility_design_pattern;

public class Request {

	private Priority priority;
	private String message;

	public Request(Priority priority, String message) {
		this.priority = priority;
		this.message = message;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
