package com.geowarin.mvc.base.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class FormDTO {

	@NotEmpty
	private String messageFromUser;

	public String getMessageFromUser() {
		return messageFromUser;
	}

	public void setMessageFromUser(String messageFromUser) {
		this.messageFromUser = messageFromUser;
	}

	@Override
	public String toString() {
		return "FormDTO [messageFromUser=" + messageFromUser + "]";
	}
}
