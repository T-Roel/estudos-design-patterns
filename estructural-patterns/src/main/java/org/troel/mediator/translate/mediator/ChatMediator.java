package org.troel.mediator.translate.mediator;

import org.troel.mediator.translate.model.User;

public class ChatMediator extends Mediator {
	@Override
	protected String getMessage(String message, User to, User from) {
		return message;
	}
}
